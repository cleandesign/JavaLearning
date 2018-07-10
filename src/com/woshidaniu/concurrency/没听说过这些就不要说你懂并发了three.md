引言
 

　　很久没有跟大家再聊聊并发了，今天LZ闲来无事，跟大家再聊聊并发。由于时间过去的有点久，因此LZ就不按照常理出牌了，只是把自己的理解记录在此，如果各位猿友觉得有所收获，就点个推荐或者留言激励下LZ，如果觉得浪费了自己宝贵的时间，也可以发下牢骚。

　　好了，废话就不多说了，现在就开始咱们的并发之旅吧。

 

并发编程的简单分类
　　

　　并发常见的编程场景，一句话概括就是，需要协调多个线程之间的协作，已保证程序按照自己原本的意愿执行。那么究竟应该如何协调多个线程？

　　这个问题比较宽泛，一般情况下，我们按照方式的纬度去简单区分，有以下两种方式：

　　1，第一种是利用JVM的内部机制。

　　2，第二种是利用JVM外部的机制，比如JDK或者一些类库。

　　第一种方式一般是通过synchronized关键字等方式去实现，第二种则一般是使用JDK当中的类去手动实现。两种方式十分相似，他们的区别有点类似于C/C++和Java的垃圾搜集方式的区别，C/C++手动释放内存的方式更加灵活和高效，而Java自动垃圾搜集的方式则更加安全和方便。

　　并发一直被认为是编程当中的高级特性，也是很多大公司在面试的时候都比较在意的部分，因此掌握好并发的简单技巧，还是能够让自己的技术沉淀有质的飞跃的。

　　

详解JVM内部机制——同步篇
 

　　JVM有很多内部同步机制，这在有的时候是非常值得我们去使用和学习的，接下来咱们就一起看看，JVM到底提供了哪些内部的同步方式。

　　1，static的强制同步机制

　　static这个关键字相信大家都不陌生，不过它附带的同步机制估计是很多猿友都不知道的。例如下面这个简单的类。


复制代码
public class Static {
 
     private static String someField1 = someMethod1();
     
     private static String someField2;
     
     static {
         someField2 = someMethod2();
     }
     
}
复制代码
　　首先上面这一段代码在编译以后会变成下面这个样子，这点各位可以使用反编译工具去验证。


复制代码
public class Static {

    private static String someField1;
    
    private static String someField2;
    
    static {
        someField1 = someMethod1();
        someField2 = someMethod2();
    }
    
}
复制代码
　　不过在JVM真正执行这段代码的时候，其实它又变成了下面这个样子。


复制代码
public class Static {

    private static String someField1;

    private static String someField2;

    private static volatile boolean isCinitMethodInvoked = false;

    static {
        synchronized (Static.class) {
            if (!isCinitMethodInvoked) {
                someField1 = someMethod1();
                someField2 = someMethod2();
                isCinitMethodInvoked = true;
            }
        }
    }

}
复制代码
　　也就是说在实际执行一个类的静态初始化代码块时，虚拟机内部其实对其进行了同步，这就保证了无论多少个线程同时加载一个类，静态块中的代码执行且只执行一次。这点在单例模式当中得到了有效的应用，各位猿友有兴趣的可以去翻看LZ之前的单例模式博文。

　　2，synchronized的同步机制

　　synchronized是JVM提供的同步机制，它可以修饰方法或者代码块。此外，在修饰代码块的时候，synchronized可以指定锁定的对象，比如常用的有this，类字面常量等。在使用synchronized的时候，通常情况下，我们会针对特定的属性进行锁定，有时也会专门建立一个加锁对象。

　　直接给方法加synchronized关键字，或者使用this，类字面常量作为锁的方式比较常用，也比较简单，这里就不再举例了。我们来看看对某一属性进行锁定的方式，如下。


复制代码
public class Synchronized {

    private List<String> someFields;
    
    public void add(String someText) {
        //some code
        synchronized (someFields) {
            someFields.add(someText);
        }
        //some code
    }
    
    public Object[] getSomeFields() {
        //some code
        synchronized (someFields) {
            return someFields.toArray();
        }
    }
    
}
复制代码
　　这种方式一般要优于使用this或者类字面常量进行锁定的方式，因为synchronized修饰的非静态成员方法默认是使用的this进行锁定，而synchronized修饰的静态成员方法默认是使用的类字面常量进行的锁定，因此如果直接在synchronized代码块中使用this或者类字面常量，可能会不经意的与synchronized方法产生互斥。通常情况下，使用属性进行加锁，能够更加有效的提高并发度，从而在保证程序正确的前提下尽可能的提高性能。

　　再来看一段比较特殊的代码，如果猿友们经常看JDK源码或者一些优秀的开源框架源码的话，或许会见过这种方式。


复制代码
public class Synchronized {
    
    private Object lock = new Object();

    private List<String> someFields1;
    private List<String> someFields2;
    
    public void add(String someText) {
        //some code
        synchronized (lock) {
            someFields1.add(someText);
            someFields2.add(someText);
        }
        //some code
    }
    
    public Object[] getSomeFields() {
        //some code
        Object[] objects1 = null;
        Object[] objects2 = null;
        synchronized (lock) {
            objects1 = someFields1.toArray();
            objects2 = someFields2.toArray();
        }
        Object[] objects = new Object[someFields1.size() + someFields2.size()];
        System.arraycopy(objects1, 0, objects, 0, objects1.length);
        System.arraycopy(objects2, 0, objects, objects1.length, objects2.length);
        return objects;
    }
    
}
复制代码
　　lock是一个专门用于监控的对象，它没有任何实际意义，只是为了与synchronized配合，完成对两个属性的统一锁定。当然，一般情况下，也可以使用this代替lock，这其实没有什么死的规定，完全可以按照实际情况而定。还有一种比较不推荐的方式，就是下面这种。


复制代码
public class Synchronized {
    
    private List<String> someFields1;
    private List<String> someFields2;
    
    public void add(String someText) {
        //some code
        synchronized (someFields1) {
            synchronized (someFields2) {
                someFields1.add(someText);
                someFields2.add(someText);
            }
        }
        //some code
    }
    
    public Object[] getSomeFields() {
        //some code
        Object[] objects1 = null;
        Object[] objects2 = null;
        synchronized (someFields1) {
            synchronized (someFields2) {
                objects1 = someFields1.toArray();
                objects2 = someFields2.toArray();
            }
        }
        Object[] objects = new Object[someFields1.size() + someFields2.size()];
        System.arraycopy(objects1, 0, objects, 0, objects1.length);
        System.arraycopy(objects2, 0, objects, objects1.length, objects2.length);
        return objects;
    }
    
}
复制代码
　　这种加锁方式比较挑战人的细心程度，万一哪个不小心把顺序搞错了，就可能造成死锁。因此如果你非要使用这种方式，请做好被你的上司行刑的准备。

　　

详解JVM外部机制——同步篇
　　

　　与JVM内部的同步机制对应的，就是外部的同步机制，也可以叫做编程式的同步机制。接下来，咱们就看看一些常用的外部同步方法。

　　ReentrantLock（可重入的锁）

　　ReentrantLock是JDK并发包中locks当中的一个类，专门用于弥补synchronized关键字的一些不足。接下来咱们就看一下synchronized关键字都有哪些不足，接着咱们再尝试使用ReentrantLock去解决这些问题。

　　1）synchronized关键字同步的时候，等待的线程将无法控制，只能死等。

　　解决方式：ReentrantLock可以使用tryLock(timeout, unit)方法去控制等待获得锁的时间，也可以使用无参数的tryLock方法立即返回，这就避免了死锁出现的可能性。

　　2）synchronized关键字同步的时候，不保证公平性，因此会有线程插队的现象。

　　解决方式：ReentrantLock可以使用构造方法ReentrantLock(fair)来强制使用公平模式，这样就可以保证线程获得锁的顺序是按照等待的顺序进行的，而synchronized进行同步的时候，是默认非公平模式的，但JVM可以很好的保证线程不被饿死。

　　ReentrantLock有这样一些优点，当然也有不足的地方。最主要不足的一点，就是ReentrantLock需要开发人员手动释放锁，并且必须在finally块中释放。

　　下面给出两个简单的ReentrantLock例子，请各位猿友收看。


复制代码
public class Lock {

    private ReentrantLock nonfairLock = new ReentrantLock();

    private ReentrantLock fairLock = new ReentrantLock(true);

    private List<String> someFields;

    public void add(String someText) {
        // 等待获得锁，与synchronized类似
        nonfairLock.lock();
        try {
            someFields.add(someText);
        } finally {
            // finally中释放锁是无论如何都不能忘的
            nonfairLock.unlock();
        }
    }

    public void addTimeout(String someText) {
        // 尝试获取，如果10秒没有获取到则立即返回
        try {
            if (!fairLock.tryLock(10, TimeUnit.SECONDS)) {
                return;
            }
        } catch (InterruptedException e) {
            return;
        }
        try {
            someFields.add(someText);
        } finally {
            // finally中释放锁是无论如何都不能忘的
            fairLock.unlock();
        }
    }

}
复制代码
 　　以上主要展示了ReentrantLock的基本用法和限时的等待，接下来咱们来看看当需要锁定多个对象的时候，ReentrantLock是如何使用的。从以下代码可以看出，用法与上面的synchronized中的方式非常相似。


复制代码
package concurrent;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zuoxiaolong
 *
 */
public class ReentrantLockTest {
    
    private ReentrantLock lock = new ReentrantLock();

    private List<String> someFields1;
    private List<String> someFields2;
    
    public void add(String someText) {
        //some code
        lock.lock();
        try {
            someFields1.add(someText);
            someFields2.add(someText);
        } finally {
            lock.unlock();
        }
        //some code
    }
    
    public Object[] getSomeFields() {
        //some code
        Object[] objects1 = null;
        Object[] objects2 = null;
        lock.lock();
        try {
            objects1 = someFields1.toArray();
            objects2 = someFields2.toArray();
        } finally {
            lock.unlock();
        }
        Object[] objects = new Object[someFields1.size() + someFields2.size()];
        System.arraycopy(objects1, 0, objects, 0, objects1.length);
        System.arraycopy(objects2, 0, objects, objects1.length, objects2.length);
        return objects;
    }
    
}
复制代码
 

详解JVM内部机制——条件等待篇
　　

　　刚才已经讨论过JVM内部同步的机制，接下来咱们一起看一下JVM内部的条件等待机制。Java当中的类有一个共同的父类Object，而在Object中，有一个wait的本地方法，这是一个神奇的方法。

　　它可以用来协调线程之间的协作，使用方式也比较简单，看一下下面这个例子，你就基本入门了哦。


复制代码
public class ObjectWait {

    private volatile static boolean lock;

    public static void main(String[] args) throws InterruptedException {
        final Object object = new Object();

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("等待被通知！");
                try {
                    synchronized (object) {
                        while (!lock) {
                            object.wait();
                        }
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("已被通知");
            }
        });
        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("马上开始通知！");
                synchronized (object) {
                    object.notify();
                    lock = true;
                }
                System.out.println("已通知");
            }
        });
        thread1.start();
        thread2.start();
        Thread.sleep(100000);
    }
}
复制代码
　　这是一个最基本的例子，我们使用一个线程在object对象上等待另外一个线程的通知，当另外一个线程通知了以后，等待的线程将会继续运行。其实初次接触这个东西，是不是感觉很有意思呢。

　　wait一般情况下最常用的场景是构造一个花销非常大的对象的时候，比如JDK动态代理在生成代理类的时候就使用了这种方式。JDK6在生成一个代理类之前，会先检测一个是否正在生成中的标识，如果正在生成的话，JDK6就会在对象上等待，直到正在生成的代理类生成完毕，然后直接从缓存中获取。

　　这里需要提醒大家的一点是，wait,notify和notifyAll方法在使用前，必须获取到当前对象的锁，否则会告诉你非法的监控状态异常。还有一点，则是如果有多个线程在wait等待，那么调用notify会随机通知其中一个线程，而不会按照顺序通知。换句话说，notify的通知机制是非公平的，notify并不保证先调用wait方法的线程优先被唤醒。notifyAll方法则不存在这个问题，它将通知所有处于wait等待的线程。

　　

详解JVM外部机制——条件等待篇
　　

　　上面咱们已经看过JVM自带的条件控制机制，是使用的本地方法wait实现的。那么在JDK的类库中，也有这样的一个类Condition，来弥补wait方法本身的不足。与之前一样，说到这里，咱们就来谈谈wait到底有哪些不足。

　　1）wait方法当使用带参数的方法wait(timeout)或者wait(timeout,nanos)时，无法反馈究竟是被唤醒还是到达了等待时间，大部分时候，我们会使用循环（就像上面的例子一样）来检测是否达到了条件。

　　解决方式：Condition可以使用返回值标识是否达到了超时时间。

　　2）由于wait,notify,notifyAll方法都需要获得当前对象的锁，因此当出现多个条件等待时，则需要依次获得多个对象的锁，这是非常恶心麻烦且繁琐的事情。

　　解决方式：Condition之需要获得Lock的锁即可，一个Lock可以拥有多个条件。

　　第一个问题比较好理解，只是Condition的await方法多了一个返回参数boolean去标识究竟是被唤醒还是超时。但是第二个问题比较繁琐一些，因此这里给出一个简单的示例，如下。


复制代码
package concurrent;

/**
 * @author zuoxiaolong
 *
 */
public class ObjectWait {

    public static void main(String[] args) throws InterruptedException {
        final Object object1 = new Object();
        final Object object2 = new Object();
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("等待object1被通知！");
                    synchronized (object1) {
                        object1.wait();
                    }
                    System.out.println("object1已被通知，马上开始通知object2！");
                    synchronized (object2) {
                        object2.notify();
                    }
                    System.out.println("通知object2完毕！");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("马上开始通知object1！");
                    synchronized (object1) {
                        object1.notify();
                    }
                    System.out.println("通知object1完毕，等待object2被通知！");
                    synchronized (object2) {
                        object2.wait();
                    }
                    System.out.println("object2已被通知！");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        Thread.sleep(1000);
        thread2.start();
    }

}
复制代码
　　这是一个多条件的示例。基本逻辑是，线程1先等待线程2通知，然后线程2再等待线程1通知。请记住，这是两个不同的条件。可以看到，如果使用wait的话，必须两次获得两个锁，一不小心可能还会出现死锁。接下来，咱们看看Condition实现一样的功能是怎么实现的。


复制代码
package concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zuoxiaolong
 *
 */
public class ConditionTest {

    private static ReentrantLock lock = new ReentrantLock();
    
    public static void main(String[] args) throws InterruptedException {
        final Condition condition1 = lock.newCondition();
        final Condition condition2 = lock.newCondition();
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                lock.lock();
                try {
                    System.out.println("等待condition1被通知！");
                    condition1.await();
                    System.out.println("condition1已被通知，马上开始通知condition2！");
                    condition2.signal();
                    System.out.println("通知condition2完毕！");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                lock.lock();
                try {
                    System.out.println("马上开始通知condition1！");
                    condition1.signal();
                    System.out.println("通知condition1完毕，等待condition2被通知！");
                    condition2.await();
                    System.out.println("condition2已被通知！");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }
            }
        });
        thread1.start();
        Thread.sleep(1000);
        thread2.start();
    }

}
复制代码
　　可以看到，我们只需要获取lock一次就可以了，在内部咱们可以使用两个或多个条件而不再需要多次获得锁。这种方式会更加直观，大大增加程序的可读性。

　　

详解JVM外部机制——线程协作篇
　　

　　JDK当中除了以上的ReentrantLock和Condition之外，还有很多帮助猿友们协调线程的工具类。接下来咱们就一一混个脸熟。

　　1，CountDownLatch

　　这个类是为了帮助猿友们方便的实现一个这样的场景，就是某一个线程需要等待其它若干个线程完成某件事以后才能继续进行。比如下面的这个程序。


复制代码
package concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * @author zuoxiaolong
 *
 */
public class CountDownLatchTest {

    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            final int number = i + 1;
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                    System.out.println("执行任务[" + number + "]");
                    countDownLatch.countDown();
                    System.out.println("完成任务[" + number + "]");
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
        System.out.println("主线程开始等待...");
        countDownLatch.await();
        System.out.println("主线程执行完毕...");
    }
    
}
复制代码
　　这个程序的主线程会等待CountDownLatch进行10次countDown方法的调用才会继续执行。我们可以从打印的结果上看出来，尽管有的时候完成任务的打印会出现在主线程执行完毕之后，但这只是因为countDown已经执行完毕，主线程的打印语句先一步执行而已。

　　2，CyclicBarrier

　　这个类是为了帮助猿友们方便的实现多个线程一起启动的场景，就像赛跑一样，只要大家都准备好了，那就开始一起冲。比如下面这个程序，所有的线程都准备好了，才会一起开始执行。


复制代码
package concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author zuoxiaolong
 *
 */
public class CyclicBarrierTest {

    public static void main(String[] args) {
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(10);
        for (int i = 0; i < 10; i++) {
            final int number = i + 1;
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                    System.out.println("等待执行任务[" + number + "]");
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                    } catch (BrokenBarrierException e) {
                    }
                    System.out.println("开始执行任务[" + number + "]");
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
    
}
复制代码
　　3，Semaphore

　　这个类是为了帮助猿友们方便的实现控制数量的场景，可以是线程数量或者任务数量等等。来看看下面这段简单的代码。


复制代码
package concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author zuoxiaolong
 *
 */
public class SemaphoreTest {

    public static void main(String[] args) throws InterruptedException {
        final Semaphore semaphore = new Semaphore(10);
        final AtomicInteger number = new AtomicInteger();
        for (int i = 0; i < 100; i++) {
            Runnable runnable = new Runnable() {
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                    try {
                        semaphore.acquire();
                        number.incrementAndGet();
                    } catch (InterruptedException e) {}
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
        Thread.sleep(10000);
        System.out.println("共" + number.get() + "个线程获得到信号");
        System.exit(0);
    }
    
}
复制代码
　　从结果上可以看出，LZ设定了总数为10，却开了100个线程，但是最终只有10个线程获取到了信号量，如果这10个线程不主动调用release方法的话，那么其余90个线程将一起挂死。

　　4，Exchanger

　　这个类是为了帮助猿友们方便的实现两个线程交换数据的场景，使用起来非常简单，看看下面这段代码。


复制代码
package concurrent;

import java.util.concurrent.Exchanger;

/**
 * @author zuoxiaolong
 *
 */
public class ExchangerTest {

    public static void main(String[] args) throws InterruptedException {
        final Exchanger<String> exchanger = new Exchanger<String>();
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("线程1等待接受");
                    String content = exchanger.exchange("thread1");
                    System.out.println("线程1收到的为：" + content);
                } catch (InterruptedException e) {}
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("线程2等待接受并沉睡3秒");
                    Thread.sleep(3000);
                    String content = exchanger.exchange("thread2");
                    System.out.println("线程2收到的为：" + content);
                } catch (InterruptedException e) {}
            }
        });
        thread1.start();
        thread2.start();
    }
    
}
复制代码
　　两个线程在只有一个线程调用exchange方法的时候调用方会被挂起，当都调用完毕时，双方会交换数据。在任何一方没调用exchange之前，线程都会处于挂起状态。

　　

小结
　　

　　今天LZ和各位一起见识了一下Java并发编程的一些基础，掌握以上信息对于并发编程还是非常有必要的。希望各位猿友能够有所收获，咱们下次见！


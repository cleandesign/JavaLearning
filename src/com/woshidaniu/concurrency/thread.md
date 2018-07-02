java基础巩固笔记5-多线程之线程并发库
原子性操作类
线程池
常用线程池
CallableFuture
LockCondition
Lock
Condition
同步工具
参考资料
本文主要概述java.util.concurrent包下的相关类和使用方法

Package java.util.concurrent

原子性操作类
java.util.concurrent.atomic包下的类:

Package java.util.concurrent.atomic

线程池
java.util.concurrent:Class Executors

常用线程池
几种常用的的生成线程池的方法：

newCachedThreadPool
newFixedThreadPool
newScheduledThreadPool
newSingleThreadExecutor
newSingleThreadScheduledExecutor
例子：newFixedThreadPool

ExecutorService threadPool = Executors.newFixedThreadPool(3);
for(int i=0;i<10;i++){
    threadPool.execute(new Runnable() {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    });
}

单线程newSingleThreadExecutor可用于重启

用线程池启动定时器

例子：类似Timer的定时执行

Executors.newScheduledThreadPool(3).scheduleAtFixedRate(
            new Runnable() {
                @Override
                public void run() {
                    System.out.println("ScheduledThreadPool "+Thread.currentThread().getName());
                }
            },3,1, TimeUnit.SECONDS
    );

Callable&Future
ExecutorService在Executor的基础上增加了一些方法，其中有两个核心的方法：

Future<?> submit(Runnable task)
<T> Future<T> submit(Callable<T> task)
这两个方法都是向线程池中提交任务，它们的区别在于Runnable在执行完毕后没有结果，Callable执行完毕后有一个结果。这在多个线程中传递状态和结果是非常有用的。另外他们的相同点在于都返回一个Future对象。Future对象可以阻塞线程直到运行完毕（获取结果，如果有的话），也可以取消任务执行，当然也能够检测任务是否被取消或者是否执行完毕。

Lock&Condition
Lock
Lock功能类似传统多线程技术里的synchronized，实现线程互斥，但更加面向对象。将需要互斥的代码片段放到lock.lock();和lock.unlock();之间。

例子

class A{
    private Lock lock = new ReentrantLock();

    public void function(){
        lock.lock();
        try{
            //功能代码
        }finally{
            lock.unlock();
        }
    }
}

读写锁
java.util.concurrent.locks:Class ReentrantReadWriteLock

javaDoc文档读写锁例子,缓存:

class CachedData {
   Object data;
   volatile boolean cacheValid;
   final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

   void processCachedData() {
     rwl.readLock().lock();
     if (!cacheValid) {
       // Must release read lock before acquiring write lock
       rwl.readLock().unlock();
       rwl.writeLock().lock();
       try {
         // Recheck state because another thread might have
         // acquired write lock and changed state before we did.
         if (!cacheValid) {
           data = ...
           cacheValid = true;
         }
         // Downgrade by acquiring read lock before releasing write lock
         rwl.readLock().lock();
       } finally {
         rwl.writeLock().unlock(); // Unlock write, still hold read
       }
     }

     try {
       use(data);
     } finally {
       rwl.readLock().unlock();
     }
   }
 }
重点注意在释放写锁前加读锁那部分代码，注释为// Downgrade by acquiring read lock before releasing write lock。自己挂了写锁，再挂读锁是可以的，这面涉及的技巧以后再研究

Condition
Condition类似于传统多线程技术中的Object.wait和Object.notify,实现线程间同步。

javaDoc文档例子，可阻塞队列

class BoundedBuffer例子

class BoundedBuffer {
   final Lock lock = new ReentrantLock();
   final Condition notFull  = lock.newCondition();
   final Condition notEmpty = lock.newCondition();

   final Object[] items = new Object[100];
   int putptr, takeptr, count;

   public void put(Object x) throws InterruptedException {
     lock.lock();
     try {
       while (count == items.length)
         notFull.await();
       items[putptr] = x;
       if (++putptr == items.length) putptr = 0;
       ++count;
       notEmpty.signal();
     } finally {
       lock.unlock();
     }
   }

   public Object take() throws InterruptedException {
     lock.lock();
     try {
       while (count == 0)
         notEmpty.await();
       Object x = items[takeptr];
       if (++takeptr == items.length) takeptr = 0;
       --count;
       notFull.signal();
       return x;
     } finally {
       lock.unlock();
     }
   }
 }

使用了两个condition

同步工具
Semaphore
类似占坑

CyclicBarrier
阶段性使进度一致

CountDownLatch
一人通知多人/多人通知一人

Exchanger
线程间数据交换，都到达则自然交换
## 抽象类和接口的对比
| 参数        | 抽象类   |  接口  |
| --------   | -----:   | :----: |
|默认的方法实现	|它可以有默认的方法实现	|接口完全是抽象的。它根本不存在方法的实现|
|实现	|子类使用extends关键字来继承抽象类。如果子类不是抽象类的话，它需要提供抽象类中所有声明的方法的实现。|	子类使用关键字implements来实现接口。它需要提供接口中所有声明的方法的实现|
|构造器	|抽象类可以有构造器|	接口不能有构造器|
|与正常Java类的区别	|除了你不能实例化抽象类之外，它和普通Java类没有任何区别	|接口是完全不同的类型|
|访问修饰符	|抽象方法可以有public、protected和default这些修饰符|	接口方法默认修饰符是public。你不可以使用其它修饰符。|
|main方法|	抽象方法可以有main方法并且我们可以运行它	|接口没有main方法，因此我们不能运行它。|
|多继承	|抽象方法可以继承一个类和实现多个接口	|接口只可以继承一个或多个其它接口|
|速度|	它比接口速度要快|	接口是稍微有点慢的，因为它需要时间去寻找在类中实现的方法。|
|添加新方法	|如果你往抽象类中添加新的方法，你可以给它提供默认的实现。因此你不需要改变你现在的代码。|	如果你往接口中添加方法，那么你必须改变实现该接口的类。|


## 创建一个类的几种方法?

1. 使用new关键字 → 调用了构造函数
2. 使用Class类的newInstance方法  → 调用了构造函数
```java
Employee emp2 = (Employee)Class.forName("org.programming.mitra.exercises.Employee").newInstance();
```
3. 使用Constructor类的newInstance方法  → 调用了构造函数
```java
Constructor<Employee> constructor = Employee.class.getConstructor();
Employee emp3 = constructor.newInstance();
```
4. 使用clone方法   → 没有调用构造函数
5. 使用反序列化  → 没有调用构造函数

```java
ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
Employee emp5 = (Employee) in.readObject();
```

## Redirect和forward

1. 上图所示的间接转发请求的过程如下：
浏览器向Servlet1发出访问请求；
Servlet1调用sendRedirect()方法，将浏览器重定向到Servlet2；
浏览器向servlet2发出请求；
最终由Servlet2做出响应。

2.  上图所示的直接转发请求的过程如下：
浏览器向Servlet1发出访问请求；
Servlet1调用forward()方法，在服务器端将请求转发给Servlet2；
最终由Servlet2做出响应。


##  什么是泛型，为什么要使用以及类型擦除。
1. 泛型的本质就是“参数化类型”，也就是说所操作的数据类型被指定为一个参数。
创建集合时就指定集合元素的数据类型，该集合只能保存其指定类型的元素，
避免使用强制类型转换。
2. Java 编译器生成的字节码是不包含泛型信息的，泛型类型信息将在 编译处理 时
被擦除，这个过程即 类型擦除。类型擦除可以简单的理解为将泛型 java 代码转
换为普通 java 代码，只不过编译器更直接点，将泛型 java 代码直接转换成普通
java 字节码。

类型擦除的主要过程如下：

1. 将所有的泛型参数用其最左边界（最顶级的父类型）类型替换。
2. 移除所有的类型参数。





## Object跟这些标记符代表的java类型有啥区别呢？
Object是所有类的根类，任何类的对象都可以设置给该Object引用变量，使用的时候可能需要类型强制转换，但是用使用了泛型T、E等这些标识符后，在实际用之前类型就已经确定了，不需要再进行类型强制转换。



## Java 异常的体系结构
Java把异常当作对象来处理，并定义一个基类java.lang.Throwable作为所有异常的超类。

在Java API中已经定义了许多异常类，这些异常类分为两大类，错误Error和异常Exception。

Java异常层次结构图如下图所示：

![](https://img-blog.csdn.net/20180701100641621)


Error：Error类对象由 Java 虚拟机生成并抛出，Error表示编译时和系统错误，通常不能预期和恢复，比如硬件故障、JVM崩溃、内存不足等 。例如，Java虚拟机运行错误（Virtual MachineError），当JVM不再有继续执行操作所需的内存资源时，将出现 OutOfMemoryError。这些异常发生时，Java虚拟机（JVM）一般会选择线程终止；还有发生在虚拟机试图执行应用时，如类定义错误（NoClassDefFoundError）、链接错误（LinkageError）。这些错误是不可查的，因为它们在应用程序的控制和处理能力之 外，而且绝大多数是程序运行时不允许出现的状况。对于设计合理的应用程序来说，即使确实发生了错误，本质上也不应该试图去处理它所引起的异常状况。在Java中，错误通常是使用Error的子类描述。

Exception：在Exception分支中有一个重要的子类RuntimeException（运行时异常），该类型的异常自动为你所编写的程序定义ArrayIndexOutOfBoundsException（数组下标越界）、NullPointerException（空指针异常）、ArithmeticException（算术异常）、MissingResourceException（丢失资源）、ClassNotFoundException（找不到类）等异常，这些异常是不检查异常，程序中可以选择捕获处理，也可以不处理。这些异常一般是由程序逻辑错误引起的，程序应该从逻辑角度尽可能避免这类异常的发生；而RuntimeException之外的异常我们统称为非运行时异常，类型上属于Exception类及其子类，从程序语法角度讲是必须进行处理的异常，如果不处理，程序就不能编译通过。如IOException、SQLException等以及用户自定义的Exception异常，一般情况下不自定义检查异常。
## throw和throws区别
**throw：（针对对象的做法）**
 抛出一个异常，可以是系统定义的，也可以是自己定义的


```java
public void yichang(){
    NumberFormatException e = new NumberFormatException();
    throw e;
}
```
**throws：（针对一个方法抛出的异常）**
抛出一个异常，可以是系统定义的，也可以是自己定义的。

```java
public void yichang() throws NumberFormatException{
    int a = Integer.parseInt("10L");
}
```
1. throws出现在方法函数头；而throw出现在函数体。
2. throws表示出现异常的一种可能性，并不一定会发生这些异常；throw则是抛出了异常，执行throw则一定抛出了某种异常。
3. 两者都是消极处理异常的方式（这里的消极并不是说这种方式不好），只是抛出或者可能抛出异常，但是不会由函数去处理异常，真正的处理异常由函数的上层调用处理。


##  .class 文件是什么类型文件
class文件是一种8位字节的二进制流文件



## java中序列化之子类继承父类序列化
父类实现了Serializable，子类不需要实现Serializable

  相关注意事项
    1. 序列化时，只对对象的状态进行保存，而不管对象的方法；
    2. 当一个父类实现序列化，子类自动实现序列化，不需要显式实现Serializable接口；
    **c）当一个对象的实例变量引用其他对象，序列化该对象时也把引用对象进行序列化；**
    3. 并非所有的对象都可以序列化，至于为什么不可以，有很多原因了,比如：
        1.安全方面的原因，比如一个对象拥有private，public等field，对于一个要传输的对象，比如写到文件，或者进行rmi传输等等，在序列化进行传输的过程中，这个对象的private等域是不受保护的。
       2. 资源分配方面的原因，比如socket，thread类，如果可以序列化，进行传输或者保存，也无法对他们进行重新的资源分配，而且，也是没有必要这样实现。

2,反过来父类未实现Serializable，子类实现了，序列化子类实例的时候，父类的属性是直接被跳过不保存，还是能保存但不能还原？（答案：值不保存）



解：父类实现接口后，所有派生类的属性都会被序列化。子类实现接口的话，父类的属性值丢失。

java中序列化之子类继承父类序列化



## 标识符
标识符可以包括这4种字符：字母、下划线、$、数字；开头不能是数字；不能是关键字





## Integer i=new Integer(127);和Integer i=127;的区别
Integer i = 127的时候，使用Java常量池技术，是为了方便快捷地创建某些对象，当你需要一个对象时候，就去这个池子里面找，找不到就在池子里面创建一个。但是必须注意 如果对象是用new 创建的。那么不管是什么对像，它是不会放到池子里的，而是向堆申请新的空间存储。Byte,Short,Integer,Long,Character这5种整型的包装类也只是在对应值在-128到127之间的数时才可使用对象池。超过了就要申请空间创建对象了

```java
    int i1=128;
    Integer i2=128;
    Integer i3=new Integer(128);//自动拆箱

    System.out.println(i1==i2);//true
    System.out.println(i1==i3);//true

    Integer i5=127;
    Integer i6=127;
    System.out.println(i5==i6);//true


    Integer i5=127;
    Integer ii5=new Integer(127);
    System.out.println(i5==ii5);//false

    Integer i7=new Integer(127);
    Integer i8=new Integer(127);
    System.out.println(i7==i8);//false
```



## 手写单例模式
最好的单例模式是静态内部类，不要写双重检验
```java
private static class LazySomethingHolder {
  public static Something something = new Something();
}

public static Something getInstance() {
  return LazySomethingHolder.something;
}
```





## 为什么线程通信的方法wait(), notify()和notifyAll()被定义在Object类里？

Java的每个对象中都有一个锁(monitor，也可以成为监视器) 并且wait()，notify()等方法用于等待对象的锁或者通知其他线程对象的监视器可用。在Java的线程中并没有可供任何对象使用的锁和同步器。这就是为什么这些方法是Object类的一部分，这样Java的每一个类都有用于线程间通信的基本方法

## Java中wait 和sleep 方法比较

1. 这两个方法来自不同的类分别是Thread和Object
2. 最主要是sleep方法没有释放锁，而wait方法释放了锁，使得其他线程可以使用同步控制块或者方法。
3. wait，notify和notifyAll只能在同步控制方法或者同步控制块里面使用，而sleep可以在任何地方使用(使用范围)
4. sleep必须捕获异常，而wait，notify和notifyAll不需要捕获异常

5. sleep方法属于Thread类中方法，表示让一个线程进入睡眠状态，等待一定的时间之后，自动醒来进入到可运行状态，不会马上进入运行状态，因为线程调度机制恢复线程的运行也需要时间，一个线程对象调用了sleep方法之后，并不会释放他所持有的所有对象锁，所以也就不会影响其他进程对象的运行。但在sleep的过程中过程中有可能被其他对象调用它的interrupt(),产生InterruptedException异常，如果你的程序不捕获这个异常，线程就会异常终止，进入TERMINATED状态，如果你的程序捕获了这个异常，那么程序就会继续执行catch语句块(可能还有finally语句块)以及以后的代码。

- 注意sleep()方法是一个静态方法，也就是说他只对当前对象有效，通过t.sleep()让t对象进入sleep，这样的做法是错误的，它只会是使当前线程被sleep 而不是t线程

7.  wait属于Object的成员方法，一旦一个对象调用了wait方法，必须要采用notify()和notifyAll()方法唤醒该进程;如果线程拥有某个或某些对象的同步锁，那么在调用了wait()后，这个线程就会释放它持有的所有同步资源，而不限于这个被调用了wait()方法的对象。wait()方法也同样会在wait的过程中有可能被其他对象调用interrupt()方法而产生

## hashCode和equals方法的关系
在有些情况下，程序设计者在设计一个类的时候为需要重写equals方法，比如String类，但是千万要注意，在重写equals方法的同时，必须重写hashCode方法。
也就是说对于两个对象，如果调用equals方法得到的结果为true，则两个对象的hashcode值必定相等；
如果equals方法得到的结果为false，则两个对象的hashcode值不一定不同；
如果两个对象的hashcode值不等，则equals方法得到的结果必定为false；
如果两个对象的hashcode值相等，则equals方法得到的结果未知。
## Object类中有哪些方法，列举3个以上（可以引导）
Object方法：equals()、toString()、finalize()、hashCode()、getClass()、clone()、wait()、notify()、notifyAll()


## String s=new String("xyz")究竟创建String Object分为两种情况：
1. 如果String常理池中，已经创建"xyz"，则不会继续创建，此时只创建了一个对象new String("xyz")；
2. 如果String常理池中，没有创建"xyz"，则会创建两个对象，一个对象的值是"xyz"，一个对象new String("xyz")。



## 什么是值传递和引用传递
值传递
```java
public class TempTest {

  private void test1(int a) {
    a = 5;
    System.out.println("test1方法中的a=" + a);
  }

  public static void main(String[] args) {
    TempTest t = new TempTest();
    int a = 3;
    t.test1(11);
    System.out.println("main方法中a=" + a);
  }

}
```
test1方法中的a=5
main方法中a=3
值传递：传递的是值的拷贝，传递后就互不相关了
引用传递：传递的是变量所对应的内存空间的地址

```java
public class TempTest {
  private void test1(A a) {
    a.age = 20;
    System.out.println("test1方法中a=" + a.age);
  }

  public static void main(String[] args) {
    TempTest t = new TempTest();
    A a = new A();
    a.age = 10;
    t.test1(a);
    System.out.println("main方法中a=" + a.age);
  }
}

class A {
  public int age = 0;
}
```
test1方法中a=20
main方法中a=20
传递前和传递后都指向同一个引用（同一个内存空间）
如果不互相影响，方法是在test1方法里面新new一个实例就可以了


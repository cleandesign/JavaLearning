       下面LZ给出简单工厂模式，工厂方法模式一直到抽象工厂模式的演变过程，三者是由简到繁的关系。由于三者都已经详细的解释过，所以此处不再多做解释，留给各位读者自己思考它们的进化过程，首先LZ给出简单工厂的具体代码。

复制代码
//抽象产品
interface Product{}

//具体产品
class ProductA implements Product{}
class ProductB implements Product{}

//产品工厂（下一步就是它的进化，就变成了工厂方法模式）
public class ProductFactory {

    private ProductFactory(){}
    
    public static Product getProduct(String productName){
        if (productName.equals("A")) {
            return new ProductA();
        }else if (productName.equals("B")) {
            return new ProductB();
        }else {
            return null;
        }
    }
}
复制代码
               LZ在上面加了简单的注释，下面LZ给出工厂方法模式的代码，注意，前面有关产品的类和接口是不变的。

复制代码
//抽象产品
interface Product{}

//具体产品
class ProductA implements Product{}
class ProductB implements Product{}

//将简单工厂中的工厂给抽象成接口
interface Factory{
    Product getProduct();
}
//具体的工厂A，创造产品A
class FactoryA implements Factory{

    public Product getProduct() {
        return new ProductA();
    }
    
}
//具体的工厂B，创造产品B
class FactoryB implements Factory{

    public Product getProduct() {
        return new ProductB();
    }
    
}
复制代码
                  可以看到，产品部分并没有变化，只是将简单工厂中的工厂类抽象成接口，并给相应产品添加相应的工厂类，就进化成了工厂方法模式。下面我们再看工厂方法如何进化成抽象工厂模式。

复制代码
//抽象产品
interface Product{}

//具体产品
class ProductA implements Product{}
class ProductB implements Product{}

//多了一个抽象产品1
interface Product1{}

//具体产品1
class Product1A implements Product1{}
class Product1B implements Product1{}

//原有的工厂方法模式的工厂里添加一个方法
interface Factory{
    Product getProduct();
    //添加另外一个产品族的创造方法
    Product1 getProduct1();
}
//具体的工厂A，创造产品A
class FactoryA implements Factory{

    public Product getProduct() {
        return new ProductA();
    }
    //添加相应的实现
    public Product1 getProduct1() {
        return new Product1A();
    }
    
}
//具体的工厂B，创造产品B
class FactoryB implements Factory{

    public Product getProduct() {
        return new ProductB();
    }
    //添加相应的实现
    public Product1 getProduct1() {
        return new Product1B();
    }
    
}
复制代码
                  与工厂方法对比下就发现，多了一个产品系列叫Product1，工厂接口里多了一个方法，叫getProduct1，所以抽象工厂模式就是工厂方法模式添加了抽象产品所演变而来的。
                  有关工厂的三个模式到这里就全部介绍完了，三者有着很大的关联和明显的关系，要想灵活运用这三种设计模式，还是要彻底理解它们所针对的问题以及三者的关系。下面罗列下这三种设计模式依次进化的原因。

                  1，首先从简单工厂进化到工厂方法，是因为工厂方法弥补了简单工厂对修改开放的弊端，即简单工厂违背了开闭原则。

                  2，从工厂方法进化到抽象工厂，是因为抽象工厂弥补了工厂方法只能创造一个系列的产品的弊端。

                  各位可以思考下，假设我们不使用抽象工厂模式，改用工厂方法去处理抽象工厂中多产品的问题，如何处理呢？其实很简单，就是有几个产品系列，我们就造几个工厂方法模式就可以了，只不过这样处理未免太不优雅，就像下面这样。

复制代码
//抽象产品
interface Product{}

//具体产品
class ProductA implements Product{}
class ProductB implements Product{}

//工厂接口
interface Factory{
    Product getProduct();
}

//具体的工厂A，创造产品A
class FactoryA implements Factory{

    public Product getProduct() {
        return new ProductA();
    }
    
}
//具体的工厂B，创造产品B
class FactoryB implements Factory{

    public Product getProduct() {
        return new ProductB();
    }
    
}

/*   以上是一个产品的工厂方法  */

//抽象产品1
interface Product1{}

//具体产品1
class Product1A implements Product1{}
class Product1B implements Product1{}

//工厂接口1
interface Factory1{
    Product1 getProduct1();
}

//具体的工厂1A，创造产品1A
class Factory1A implements Factory1{

    public Product1 getProduct1() {
        return new Product1A();
    }
    
}
//具体的工厂1B，创造产品1B
class Factory1B implements Factory1{

    public Product1 getProduct1() {
        return new Product1B();
    }
    
}
复制代码
                以上用两个工厂方法模式，代替了抽象工厂模式，那么可想而知，假设又多了一个产品Product2，那么我们还需要再建立一套工厂方法模式，这显然会大大增加系统的复杂性，而且也不易于客户端操作。

                不过这也不一定就不可以，假设我们上面Product和Factory接口包括它们的一套实现是现有的，并且我们无法改变，比如是一个第三方的jar包提供的。那么为了扩展这个第三方的jar包，我们可以将jar包中的工厂方法模式扩展成为抽象工厂来达到我们扩展现有类功能的目的，就像下面这样。

复制代码
//抽象产品
interface Product{}

//具体产品
class ProductA implements Product{}
class ProductB implements Product{}

//工厂接口
interface Factory{
    Product getProduct();
}

//具体的工厂A，创造产品A
class FactoryA implements Factory{

    public Product getProduct() {
        return new ProductA();
    }
    
}
//具体的工厂B，创造产品B
class FactoryB implements Factory{

    public Product getProduct() {
        return new ProductB();
    }
    
}

/*   假设以上是一个第三方jar包中的工厂方法模式，我们无法改动源码   */

//我们自己特有的产品
interface MyProduct{}

//我们自己特有的产品实现
class MyProductA implements MyProduct{}
class MyProductB implements MyProduct{}

//扩展原有的工厂接口
interface MyFactory extends Factory{
    MyProduct getMyProduct();
}

//我们自己特有的工厂A，扩展自原有的工厂A，并且实现获得我们自己特有产品的接口方法
class MyFactoryA extends FactoryA implements MyFactory{

    public MyProduct getMyProduct() {
        return new MyProductA();
    }
    
}
//同A
class MyFactoryB extends FactoryB implements MyFactory{

    public MyProduct getMyProduct() {
        return new MyProductB();
    }
    
}
复制代码
                  这样我们就可以得到我们自己特有的抽象工厂和使用我们自己特有的产品了，并且我们自己的抽象工厂还兼并了第三方jar包中的产品，例如，我们可以使用MyFactoryA获得jar包中的ProductA产品等。

                  上面的做法相当于我们从现有的体系当中，扩展出一套我们自己的继承体系，这样做的好处是我们可以完整的复用jar包中的各个类功能，缺点是继承会导致系统的复杂性增加，耦合度相对较高。

                  所以我们还可以有另外一种做法，就是创造我们自己的一套独有的工厂方法模式，这套体系与jar包中的类和接口毫无关系，我们再使用一个组合工厂将二者结合起来，就像下面这样。

复制代码
//抽象产品
interface Product{}

//具体产品
class ProductA implements Product{}
class ProductB implements Product{}

//工厂接口
interface Factory{
    Product getProduct();
}

//具体的工厂A，创造产品A
class FactoryA implements Factory{

    public Product getProduct() {
        return new ProductA();
    }
    
}
//具体的工厂B，创造产品B
class FactoryB implements Factory{

    public Product getProduct() {
        return new ProductB();
    }
    
}

/*   假设以上是一个第三方jar包中的工厂方法模式，我们无法改动源码   */

//我们自己特有的产品
interface MyProduct{}

//我们自己特有的产品实现
class MyProductA implements MyProduct{}
class MyProductB implements MyProduct{}

//我们自己的工厂接口
interface MyFactory{
    MyProduct getMyProduct();
}

//我们自己特有的工厂A，产生产品A
class MyFactoryA implements MyFactory{
    
    public MyProduct getMyProduct() {
        return new MyProductA();
    }
    
}

//我们自己特有的工厂B，产生产品B
class MyFactoryB implements MyFactory{
    
    public MyProduct getMyProduct() {
        return new MyProductB();
    }
    
}

/*  到这里是我们自己的一套工厂方法模式，去创造我们自己的产品，以下我们将以上二者组合   */

//我们使用组合的方式将我们的产品系列和jar包中的产品组合起来
class AssortedFactory implements MyFactory,Factory{
    
    MyFactory myFactory;
    Factory factory;
    
    public AssortedFactory(MyFactory myFactory, Factory factory) {
        super();
        this.myFactory = myFactory;
        this.factory = factory;
    }

    public Product getProduct() {
        return factory.getProduct();
    }

    public MyProduct getMyProduct() {
        return myFactory.getMyProduct();
    }
    
}
复制代码
                    可以看到，组合的工厂AssortedFactory集成了我们自己的工厂和jar包中的工厂两者的功能。这样做则会非常灵活，因为我们的一套体系不再依赖于jar包中的类或接口而存在，哪怕是jar包中的类改变或者不在了，我们自己的这一套依旧可以独立存在。

                    从上面就可以看出，我们在处理很多问题的时候其实是有很多种方式的，而且每一种方式可能都有各自的好处和坏处，很难去判断说那一种方式是最好的，而且也根本就没有这个说法，所以我们能做的，就是根据实际的情况去掂量各个方式的利弊，从而选择出一种更适合当前情况的处理方式。

                    本期抽象工厂模式就到这里了，希望各位看到这里对三个与工厂相关的模式有一定自己的理解，并且可以灵活使用，达到无模式就是最好的模式的境界，甚至，我们可以把我们自己写的东西起个名字，冒充设计模式，比如最后一种我们叫它组合工厂模式。当然，LZ本人并未达到无模式的境界，正在与各位一起努力。

                    感谢各位的收看。
package com.woshidaniu.singletonPattern;

/**
 * Created by kang on 2018/7/3.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {

        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();
        //Singleton object1 = Singleton.getSingleton();
        Singleton object2 = Singleton.getInstance();
        //显示消息
        object.showMessage();
        object2.showMessage();

    }
}

package com.woshidaniu.designpattern.行为.策略.demo1;

/**
 * Created by kang on 2018/7/7.
 */
public class MyClass {

    public void myMethod(MyInterface myInterface){
        System.out.println("方法里的代码");
        //你看我是不是插进来一段代码？而且这段代码是可以随便改变的
        myInterface.insertCode();
        System.out.println("方法里的代码");
    }
}

package com.woshidaniu.designpattern.行为.策略.demo1;

/**
 * Created by kang on 2018/7/7.
 */
public class Client {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.myMethod(new InsertCode1());
        System.out.println("--------------------");
        myClass.myMethod(new InsertCode2());
    }
}

package com.woshidaniu.dynamicproxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TestInvocationHandler handler = new TestInvocationHandler(new SayImpl());
        Say say =(Say)Proxy.newProxyInstance(SayImpl.class.getClassLoader(),SayImpl.class.getInterfaces(),handler);

       // Say say =(Say)Proxy.newProxyInstance(handler.getClass().getClassLoader(),SayImpl.class.getInterfaces(),handler);
        System.out.println(say.getClass().getName());
        say.sayHello("康智冬");

    }
}

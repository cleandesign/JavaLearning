package com.woshidaniu.aop_dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by kang on 2018/7/2.
 */
public class Main {

    private static Object getProxy(final Object target,final Advice advice){
        Object proxy = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        advice.beforeMethod(method);
                        Object retVal = method.invoke(target,args);
                        advice.aftereMethod(method);
                        return retVal;
                    }
                }
        );
        return proxy;
    }
    public static void main(String[] args) {
        Collection proxy3 = (Collection) getProxy(new ArrayList(),new MyAdvice());
        proxy3.add("111");
        proxy3.add("222");
        System.out.println(proxy3.size());
    }
}

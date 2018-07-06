package com.woshidaniu.oom;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by kang on 2018/7/3.
 */
//-XX:MaxMetaspaceSize=10M
public class MetaSpace {
    public static void main(String[] args) {
        while (true){
            Enhancer enhancer = new Enhancer() ;
            enhancer.setSuperclass(OutOfMemory.class);
            enhancer.setUseCache(false) ;
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invoke(o,objects) ;
                }
            });
            enhancer.create() ;

        }
    }
}

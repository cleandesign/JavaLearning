package com.woshidaniu.designpattern.行为.模板方法.ClassLoader;

/**
 * Created by kang on 2018/7/7.
 */
public class ClassLoaderTest {

    public static void main(String[] args) throws Exception {
        Class<?> clazz = ClassLoader.getSystemClassLoader().loadClass("com.woshidaniu.designpattern.行为.模板方法.ClassLoader.ClassLoaderTest");
        Object entity = clazz.newInstance();
        System.out.println(entity instanceof ClassLoaderTest);
    }
}

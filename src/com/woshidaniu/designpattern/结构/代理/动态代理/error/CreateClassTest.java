package com.woshidaniu.designpattern.结构.代理.动态代理.error;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by kang on 2018/7/5.
 */
public class CreateClassTest {

    public static void main(String[] args) throws IOException {
        byte[] classFile = ProxyGenerator.generateProxyClass("TestProxy", new Class[]{TestInterface.class});
        File file = new File("/Users/kang/Project/JavaLearning/src/com/woshidaniu/designpattern/结构/代理/动态代理/error/TestProxy.class");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(classFile);
        fos.flush();
        fos.close();
    }

}
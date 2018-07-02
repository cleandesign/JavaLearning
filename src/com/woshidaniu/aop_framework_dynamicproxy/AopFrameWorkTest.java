package com.woshidaniu.aop_framework_dynamicproxy;

import java.io.InputStream;
import java.util.Collection;

/**
 * Created by kang on 2018/7/2.
 */
public class AopFrameWorkTest {
    public static void main(String[] args) {
        InputStream inputStream = AopFrameWorkTest.class.getResourceAsStream("config.properties");
        Object bean = new BeanFactory(inputStream).getBean("xxx");
        System.out.println(bean.getClass().getName());
        ((Collection) bean).clear();
    }
}

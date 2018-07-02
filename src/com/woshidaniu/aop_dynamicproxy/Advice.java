package com.woshidaniu.aop_dynamicproxy;

import java.lang.reflect.Method;

/**
 * Created by kang on 2018/7/2.
 */
public interface Advice {
    void beforeMethod(Method method);
    void aftereMethod(Method method);
}

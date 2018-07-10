package com.woshidaniu.designpattern.行为.解释器;

/**
 * Created by kang on 2018/7/9.
 */
//抽象表达式，定义一个解释操作
public interface Expression {

    void interpreter(Context context);

}

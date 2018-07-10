package com.woshidaniu.designpattern.行为.解释器;

/**
 * Created by kang on 2018/7/9.
 */

//终结符表达式，对应-、+
public class OperatorExpression implements Expression{

    public void interpreter(Context context) {
        context.setOperator(context.current());//设置运算符
    }

}
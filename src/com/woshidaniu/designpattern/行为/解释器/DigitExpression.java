package com.woshidaniu.designpattern.行为.解释器;

/**
 * Created by kang on 2018/7/9.
 */
//终结符表达式，对应0、1、2、3、4、5、6、7、8、9
public class DigitExpression implements Expression{

    public void interpreter(Context context) {
        Expression expression = new NumberExpression();//如果是数字，则直接转为number表达式
        expression.interpreter(context);
    }

}
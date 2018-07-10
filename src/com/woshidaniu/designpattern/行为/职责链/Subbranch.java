package com.woshidaniu.designpattern.行为.职责链;

/**
 * Created by kang on 2018/7/8.
 */
//分店接口（相当于Hanlder）
public interface Subbranch {

    void setSuccessor(Subbranch subbranch);

    boolean handleOrder(Order order);

}

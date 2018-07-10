package com.woshidaniu.designpattern.行为.访问者;

/**
 * Created by kang on 2018/7/8.
 */
//账单查看者接口（相当于Visitor）
public interface AccountBookViewer {

    //查看消费的单子
    void view(ConsumeBill bill);

    //查看收入的单子
    void view(IncomeBill bill);

}
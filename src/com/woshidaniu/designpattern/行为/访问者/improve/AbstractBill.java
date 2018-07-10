package com.woshidaniu.designpattern.行为.访问者.improve;

/**
 * Created by kang on 2018/7/9.
 */
//抽象单子类，一个高层次的单子抽象
public abstract class AbstractBill implements Bill{

    protected double amount;

    protected String item;

    public AbstractBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }

}

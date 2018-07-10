package com.woshidaniu.designpattern.行为.访问者;

/**
 * Created by kang on 2018/7/8.
 */
//收入单子
public class IncomeBill implements Bill{

    private double amount;

    private String item;

    public IncomeBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    public void accept(AccountBookViewer viewer) {
        viewer.view(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }

}
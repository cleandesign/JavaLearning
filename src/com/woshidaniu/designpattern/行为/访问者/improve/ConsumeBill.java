package com.woshidaniu.designpattern.行为.访问者.improve;

/**
 * Created by kang on 2018/7/9.
 */
//消费的单子
public class ConsumeBill extends AbstractBill{

    public ConsumeBill(double amount, String item) {
        super(amount, item);
    }

    public void accept(Viewer viewer) {
        if (viewer instanceof AbstractViewer) {
            ((AbstractViewer)viewer).viewConsumeBill(this);
            return;
        }
        viewer.viewAbstractBill(this);
    }

}
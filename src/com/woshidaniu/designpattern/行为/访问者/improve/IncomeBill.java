package com.woshidaniu.designpattern.行为.访问者.improve;

/**
 * Created by kang on 2018/7/9.
 */
//收入单子
public class IncomeBill extends AbstractBill{

    public IncomeBill(double amount, String item) {
        super(amount, item);
    }

    public void accept(Viewer viewer) {
        if (viewer instanceof AbstractViewer) {
            ((AbstractViewer)viewer).viewIncomeBill(this);
            return;
        }
        viewer.viewAbstractBill(this);
    }

}
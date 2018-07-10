package com.woshidaniu.designpattern.行为.访问者.improve;

/**
 * Created by kang on 2018/7/9.
 */
//超级访问者接口（它支持定义高层操作）
public interface Viewer{

    void viewAbstractBill(AbstractBill bill);

}
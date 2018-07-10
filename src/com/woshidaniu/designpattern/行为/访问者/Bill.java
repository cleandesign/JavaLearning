package com.woshidaniu.designpattern.行为.访问者;

/**
 * Created by kang on 2018/7/8.
 */
//单个单子的接口（相当于Element）
public interface Bill {

    void accept(AccountBookViewer viewer);

}

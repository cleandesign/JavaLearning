package com.woshidaniu.designpattern.行为.访问者.improve;

/**
 * Created by kang on 2018/7/9.
 */
//单个单子的接口（相当于Element）
public interface Bill {

    void accept(Viewer viewer);

}

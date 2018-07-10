package com.woshidaniu.designpattern.行为.策略.calprice;

/**
 * Created by kang on 2018/7/7.
 */
public interface CalPrice {
    //根据原价返回一个最终的价格
    Double calPrice(Double originalPrice);
}

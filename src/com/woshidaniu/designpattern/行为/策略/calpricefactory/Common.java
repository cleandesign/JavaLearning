package com.woshidaniu.designpattern.行为.策略.calpricefactory;

/**
 * Created by kang on 2018/7/7.
 */
public class Common implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice;

    }
}

package com.woshidaniu.designpattern.行为.策略.calpriceannotation;


/**
 * Created by kang on 2018/7/7.
 */
@TotalValidRegion(max=1000)//设置普通的在0-1000生效，以下类似，不再注释
public class Common implements  CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice;

    }
}

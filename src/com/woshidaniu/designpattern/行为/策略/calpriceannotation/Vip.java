package com.woshidaniu.designpattern.行为.策略.calpriceannotation;

/**
 * Created by kang on 2018/7/7.
 */
@TotalValidRegion(min=1000,max=2000)
public class Vip implements CalPrice{

    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.8;
    }

}
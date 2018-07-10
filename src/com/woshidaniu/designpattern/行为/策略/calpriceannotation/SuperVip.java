package com.woshidaniu.designpattern.行为.策略.calpriceannotation;


/**
 * Created by kang on 2018/7/7.
 */
@TotalValidRegion(min=2000,max=3000)
public class SuperVip implements CalPrice{

    public Double calPrice(Double originalPrice) {
        return originalPrice * 0.7;
    }

}
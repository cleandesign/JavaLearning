package com.woshidaniu.designpattern.行为.策略.calpriceannotation;

/**
 * Created by kang on 2018/7/7.
 */
@TotalValidRegion(min=3000)
public class GoldVip implements CalPrice{

public Double calPrice(Double originalPrice) {
        return originalPrice * 0.5;
        }
}
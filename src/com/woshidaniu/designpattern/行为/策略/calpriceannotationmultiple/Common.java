package com.woshidaniu.designpattern.行为.策略.calpriceannotationmultiple;


/**
 * Created by kang on 2018/7/7.
 */
//我们使用嵌套注解，并且制定我们打折的各个策略顺序是99，这算是很靠后的
//因为我们最后打折算出来钱是最多的，这个一算就很清楚，LZ不再解释数学问题
@TotalValidRegion(@ValidRegion(max=1000,order=99))
public class Common implements CalPrice {
    @Override
    public Double calPrice(Double originalPrice) {
        return originalPrice;

    }
}

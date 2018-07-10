package com.woshidaniu.designpattern.行为.中介者;

/**
 * Created by kang on 2018/7/7.
 */
public class StrategySchool extends School{

    public StrategySchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }

    public String getName() {
        return "策略宫";
    }

}

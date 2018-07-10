package com.woshidaniu.designpattern.行为.中介者;

/**
 * Created by kang on 2018/7/7.
 */
public class MediatorSchool extends School{

    public MediatorSchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }

    public String getName() {
        return "中介者神阁";
    }

}
package com.woshidaniu.designpattern.行为.中介者;

/**
 * Created by kang on 2018/7/7.
 */
public class SingletonSchool extends School{

    public SingletonSchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }

    public String getName() {
        return "单例宗";
    }

}
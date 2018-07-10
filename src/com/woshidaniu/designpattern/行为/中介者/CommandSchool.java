package com.woshidaniu.designpattern.行为.中介者;

/**
 * Created by kang on 2018/7/7.
 */
public class CommandSchool extends School {
    public CommandSchool(IPatternAlliance patternAlliance) {
        super(patternAlliance);
    }
    @Override
    public String getName() {
        return "命令门";
    }
}

package com.woshidaniu.designpattern.行为.命令;

/**
 * Created by kang on 2018/7/7.
 */
public class Programmer {
    private String name;

    public Programmer(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void handleDemand(){
        System.out.println( name + "处理新需求");
    }

    public void handleBug(){
        System.out.println( name + "处理bug");
    }

    public void handleProblem(){
        System.out.println( name + "处理线上问题");
    }
}

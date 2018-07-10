package com.woshidaniu.designpattern.行为.命令;

/**
 * Created by kang on 2018/7/7.
 */

public class Bug implements Task{

    private Programmer programmer;

    public Bug(Programmer programmer) {
        super();
        this.programmer = programmer;
    }

    public void handle() {
        programmer.handleBug();
    }

    public String toString() {
        return "Bug [programmer=" + programmer.getName() + "]";
    }

}
package com.woshidaniu.designpattern.行为.命令;

/**
 * Created by kang on 2018/7/7.
 */
public class Problem implements Task{

    private Programmer programmer;

    public Problem(Programmer programmer) {
        super();
        this.programmer = programmer;
    }

    public void handle() {
        programmer.handleProblem();
    }

    public String toString() {
        return "Problem [programmer=" + programmer.getName() + "]";
    }

}

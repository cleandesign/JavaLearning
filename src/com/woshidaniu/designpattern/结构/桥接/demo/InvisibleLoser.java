package com.woshidaniu.designpattern.结构.桥接.demo;

/**
 * Created by kang on 2018/7/7.
 */
//带有隐身技能的屌丝分身
public class InvisibleLoser extends Loser{

    public InvisibleLoser(){
        System.out.println("制造一个带隐身技能的屌丝分身");
    }

    public void releaseSkills(){
        System.out.println("屌丝分身释放隐身技能");
    }
}
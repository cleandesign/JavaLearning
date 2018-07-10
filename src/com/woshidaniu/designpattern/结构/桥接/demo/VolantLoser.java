package com.woshidaniu.designpattern.结构.桥接.demo;

/**
 * Created by kang on 2018/7/7.
 */
//带有飞行技能的屌丝分身
public class VolantLoser extends Loser{

    public VolantLoser(){
        System.out.println("制造一个带飞行技能的屌丝分身");
    }

    public void releaseSkills(){
        System.out.println("屌丝分身释放飞行技能");
    }
}

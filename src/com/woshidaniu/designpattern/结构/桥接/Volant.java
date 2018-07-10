package com.woshidaniu.designpattern.结构.桥接;

/**
 * Created by kang on 2018/7/7.
 */
//飞行技能
public class Volant implements Skills{

    public void releaseSkills(){
        System.out.println("释放飞行技能");
    }
}
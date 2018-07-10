package com.woshidaniu.designpattern.结构.桥接.demo;

/**
 * Created by kang on 2018/7/7.
 */
////屌丝分身
public class Loser extends Soul{

    public Loser(){
        System.out.println("制造一个无技能的屌丝分身");
    }

    public void doAllLikePeople(){
        System.out.println("分身可以像正常人一样做任何事");
    }

    public void show(){
        System.out.println("展示屌丝形象");
    }

}


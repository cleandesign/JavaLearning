package com.woshidaniu.designpattern.结构.桥接.demo;

/**
 * Created by kang on 2018/7/7.
 */
public class Use {
    public static void main(String[] args) {
        InvisibleLoser invisibleLoser = new InvisibleLoser();
        invisibleLoser.releaseSkills();
        System.out.println("------------------------------------");
        ReadMindTRH readMindTRH = new ReadMindTRH();
        readMindTRH.releaseSkills();
        System.out.println("------------------------------------");
        InvisibleTRH invisibleTRH = new InvisibleTRH();
        invisibleTRH.releaseSkills();
    }
}

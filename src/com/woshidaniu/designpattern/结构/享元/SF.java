package com.woshidaniu.designpattern.结构.享元;

/**
 * Created by kang on 2018/7/8.
 */
public class SF extends AbstractHero{

    public String getName() {
        return "影魔";
    }

    public void initSkills() {
        skills[0] = "毁灭阴影";
        skills[1] = "支配死灵";
        skills[2] = "魔王降临";
        skills[3] = "魂之挽歌";
    }

}
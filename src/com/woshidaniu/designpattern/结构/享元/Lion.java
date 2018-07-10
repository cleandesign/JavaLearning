package com.woshidaniu.designpattern.结构.享元;

/**
 * Created by kang on 2018/7/8.
 */
public class Lion extends AbstractHero{

    public String getName() {
        return "恶魔巫师";
    }

    public void initSkills() {
        skills[0] = "穿刺";
        skills[1] = "妖术";
        skills[2] = "法力汲取";
        skills[3] = "死亡一指";
    }

}

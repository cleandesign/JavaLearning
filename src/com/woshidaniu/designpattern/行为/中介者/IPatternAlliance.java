package com.woshidaniu.designpattern.行为.中介者;

/**
 * Created by kang on 2018/7/7.
 */
//模式联盟，中介者接口
public interface IPatternAlliance {

    //加入联盟
    public abstract void add(School school);

    //联盟攻击
    public abstract void resolveAttack(School activeSide, School passiveSide);

    //联盟防御
    public abstract void resolveDefense(School passiveSide);

}


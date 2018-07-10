package com.woshidaniu.designpattern.创建.建造者;

/**
 * Created by kang on 2018/7/8.
 */
public interface DoppelgangerBuilder {
    public void createDoppelganger(String name);

    public void buildBody();

    public void buildHead();

    public void buildLeftArm();

    public void buildLeftHand();

    public void buildRightArm();

    public void buildRightHand();

    public void buildLeftLeg();

    public void buildLeftFoot();

    public void buildRightLeg();

    public void buildRightFoot();

    public Doppelganger getDoppelganger();
}

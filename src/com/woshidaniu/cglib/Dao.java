package com.woshidaniu.cglib;

/**
 * Created by kang on 2018/7/3.
 */
public class Dao {
    public Dao() {
        update();
    }

    public void update() {
        System.out.println("PeopleDao.update()");
    }

    public void select() {
        System.out.println("PeopleDao.select()");
    }
}

package com.woshidaniu.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by kang on 2018/7/3.
 */
public class CglibTest {
    public static void main(String[] args) {
        DaoProxy daoProxy = new DaoProxy();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dao.class);
        enhancer.setCallback(daoProxy);
        enhancer.setInterceptDuringConstruction(false);

        Dao dao = (Dao)enhancer.create();
        dao.update();
        dao.select();
    }
}

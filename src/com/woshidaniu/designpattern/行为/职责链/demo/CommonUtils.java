package com.woshidaniu.designpattern.行为.职责链.demo;

import java.util.Map;

/**
 * Created by kang on 2018/7/8.
 */
//简单的工具类
public class CommonUtils {

    private CommonUtils(){}

    //计算坐标之间的距离
    public static double getDistance(int x1,int y1,int x2,int y2){
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
    //是否缺货
    public static boolean outOfStock(Map<String, Integer> menu, Map<String, Integer> order){
        if (order == null || order.size() == 0) {
            return false;
        }
        if (menu == null || menu.size() == 0) {
            return true;
        }
        for (String name : order.keySet()) {
            if (menu.get(name) - order.get(name) < 0) {
                return true;
            }
        }
        return false;
    }

}
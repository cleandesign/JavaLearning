package com.woshidaniu.designpattern.行为.职责链;

import java.util.Map;

/**
 * Created by kang on 2018/7/8.
 */
//订单类（相当于request，其实就是封装一个请求）
public class Order {

    private int x;
    private int y;
    private Map<String, Integer> order;

    public Order(int x, int y, Map<String, Integer> order) {
        super();
        this.x = x;
        this.y = y;
        this.order = order;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Map<String, Integer> getOrder() {
        return order;
    }

    public void setOrder(Map<String, Integer> order) {
        this.order = order;
    }

}

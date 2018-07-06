package com.woshidaniu.designpattern.创建.简单工厂;

/**
 * Created by kang on 2018/7/5.
 */
public class Creator {
    private Creator(){}

    public static IProduct createProduct(String productName){
        if (productName == null) {
            return null;
        }
        if (productName.equals("A")) {
            return new ProductA();
        }else if (productName.equals("B")) {
            return new ProductB();
        }else {
            return null;
        }
    }
}


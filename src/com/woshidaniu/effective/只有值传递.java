package com.woshidaniu.effective;

/**
 * Created by kang on 2018/7/9.
 */
public class 只有值传递 {
    public static void main(String[] args)
    {
        int a = 2;
        Object object = new Object();
        System.out.println(a + ":" + object);
        change(a, object);
        System.out.println(a + ":" + object);
    }

    public static void change(int a,Object object){
        a = 1;
        object = new Object();
    }
}

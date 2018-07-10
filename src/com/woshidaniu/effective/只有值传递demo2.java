package com.woshidaniu.effective;

/**
 * Created by kang on 2018/7/9.
 */
public class 只有值传递demo2 {
    public static void main(String[] args)
    {
        int a = 2;
        Entity entity = new Entity();
        entity.a = 100;
        System.out.println(a + ":" + entity);
        System.out.println(entity.a);
        change(a, entity);
        System.out.println(a + ":" + entity);
        System.out.println(entity.a);
    }

    public static void change(int a,Entity entity){
        a = 1;
        entity.a = 200;
    }
}

class Entity{
    int a;
}
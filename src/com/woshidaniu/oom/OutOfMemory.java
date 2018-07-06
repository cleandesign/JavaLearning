package com.woshidaniu.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kang on 2018/7/3.
 */
//-Xms10m -Xmx10m
public class OutOfMemory {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10) ;
        while (true){
            list.add("1") ;
        }
    }
}

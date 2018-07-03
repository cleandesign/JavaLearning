package com.woshidaniu.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Created by kang on 2018/7/2.
 */
public class TestCase {
    public static void main(String[] args) {
        ServiceLoader<Search> s = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = s.iterator();
        while (iterator.hasNext()) {
            Search search =  iterator.next();
            search.searchDoc("hello world");
        }
    }

}

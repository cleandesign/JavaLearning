package com.woshidaniu.spi;

import java.util.List;

/**
 * Created by kang on 2018/7/2.
 */
public class DatabaseSearch implements Search {
    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("数据搜索 "+keyword);
        return null;
    }
}

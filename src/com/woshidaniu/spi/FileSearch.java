package com.woshidaniu.spi;

import java.util.List;

/**
 * Created by kang on 2018/7/2.
 */
public class FileSearch implements Search {
    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("文件搜索 "+keyword);
        return null;
    }
}

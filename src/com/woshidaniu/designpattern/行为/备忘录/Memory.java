package com.woshidaniu.designpattern.行为.备忘录;

import java.util.List;

/**
 * Created by kang on 2018/7/8.
 */
//记忆类（备忘录）
public class Memory {

    private List<String> storyList;

    public List<String> getStoryList() {
        return storyList;
    }

    public void setStoryList(List<String> storyList) {
        this.storyList = storyList;
    }

}
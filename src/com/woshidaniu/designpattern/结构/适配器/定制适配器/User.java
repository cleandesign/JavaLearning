package com.woshidaniu.designpattern.结构.适配器.定制适配器;

/**
 * Created by kang on 2018/7/7.
 */
public class User extends BaseEntity {
    private Integer id;
    private String name;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

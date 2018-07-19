package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.prototype.example8;
public interface Prototype {
	public Prototype clone();
	public String getName();
	public void setName(String name);
}
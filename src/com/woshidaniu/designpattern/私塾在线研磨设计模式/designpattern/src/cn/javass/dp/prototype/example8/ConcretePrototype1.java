package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.prototype.example8;
/**
 * ��¡�ľ���ʵ�ֶ���
 */
public class ConcretePrototype1 implements Prototype {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Prototype clone() {
		ConcretePrototype1 prototype = new ConcretePrototype1();
		prototype.setName(this.name);
		return prototype;
	}
	public String toString(){
		return "Now in Prototype1��name="+name;
	}
}


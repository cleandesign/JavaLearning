package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.prototype.example7;
/**
 * ��Ʒ����
 */
public class Product implements Cloneable{
	/**
	 * ��Ʒ���
	 */
	private String productId;	
	/**
	 * ��Ʒ����
	 */
	private String name;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String toString(){
		return "��Ʒ���="+this.productId+"����Ʒ����="+this.name;
	}
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}	
}

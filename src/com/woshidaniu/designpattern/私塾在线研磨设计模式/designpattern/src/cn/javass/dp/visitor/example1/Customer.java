package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example1;
/**
 * ���ֿͻ��ĸ���
 */
public abstract class Customer {
	/**
	 * �ͻ����
	 */
	private String customerId;
	/**
	 * �ͻ�����
	 */
	private String name;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	/**
	 * �ͻ������������ķ�����ʾ��һ��
	 */
	public abstract void serviceRequest();
}

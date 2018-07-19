package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.prototype.example1;
/**
 * ���˶�������
 */
public class PersonalOrder implements OrderApi{
	/**
	 * ������Ա����
	 */
	private String customerName;
	/**
	 * ��Ʒ���
	 */
	private String productId;
	/**
	 * ������Ʒ����
	 */
	private int orderProductNum = 0;
	
	public int getOrderProductNum() {
		return this.orderProductNum;
	}	
	public void setOrderProductNum(int num) {
		this.orderProductNum = num;
	}	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String toString(){
		return "�����˶����Ķ�������="+this.customerName+"��������Ʒ��="+this.productId+"����������Ϊ="+this.orderProductNum;
	}
}

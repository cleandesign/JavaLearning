package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.chainofresponsibility.example5;
/**
 * ��װ��Ԥ֧���÷�����ҵ����ص���������
 */
public class PreFeeRequestModel extends RequestModel{
	/**
	 * Լ�������ҵ������
	 */
	public final static String FEE_TYPE = "preFee";
	public PreFeeRequestModel() {
		super(FEE_TYPE);
	}
	/**
	 * ������
	 */
	private String user;
	/**
	 * ������
	 */
	private double fee;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
}

package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.strategy.example5;
/**
 * ��չ��֧�������Ķ���
 */
public class PaymentContext2 extends PaymentContext {
	/**
	 * �����ʺ�
	 */
	private String account = null;
	/**
	 * ���췽�������뱻֧�����ʵ���Ա��Ӧ֧���Ľ��;����֧������
	 * @param userName ��֧�����ʵ���Ա
	 * @param money Ӧ֧���Ľ��
	 * @param account ֧�����������ʺ�
	 * @param strategy �����֧������
	 */
	public PaymentContext2(String userName,double money,String account,PaymentStrategy strategy){
		super(userName,money,strategy);
		this.account = account;
	}
	public String getAccount() {
		return account;
	}
}

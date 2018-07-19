package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.strategy.example5;
/**
 * ֧�����ʵĲ��ԵĽӿڣ���˾�ж���֧�����ʵ��㷨
 * ���磺�ֽ����п����ֽ�ӹ�Ʊ���ֽ����Ȩ����Ԫ֧���ȵ�
 */
public interface PaymentStrategy {
	/**
	 * ��˾��ĳ������֧������
	 * @param ctx ֧�����ʵ������ģ���������㷨��Ҫ������
	 */
	public void pay(PaymentContext ctx);
}

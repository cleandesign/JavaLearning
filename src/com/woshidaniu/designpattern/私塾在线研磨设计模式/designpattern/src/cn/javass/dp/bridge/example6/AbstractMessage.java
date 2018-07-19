package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.bridge.example6;

/**
 * �������Ϣ����
 */
public abstract class AbstractMessage {
	/**
	 * ����һ��ʵ�ֲ��ֵĶ���
	 */
	protected MessageImplementor impl;
	/**
	 * ���췽��������ʵ�ֲ��ֵĶ��� 
	 * @param impl ʵ�ֲ��ֵĶ���
	 */
	public AbstractMessage(MessageImplementor impl){
		this.impl = impl;
	}
	
	/**
	 * ������Ϣ��ת��ʵ�ֲ��ֵķ���
	 * @param message Ҫ���͵���Ϣ����
	 * @param toUser ����Ϣ���͵�Ŀ����Ա
	 */
	public void sendMessage(String message,String toUser){
		this.impl.send(message, toUser);
	}
	
}

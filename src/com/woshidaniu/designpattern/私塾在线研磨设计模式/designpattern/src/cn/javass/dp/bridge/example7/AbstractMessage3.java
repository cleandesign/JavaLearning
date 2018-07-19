package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.bridge.example7;

/**
 * �������Ϣ����
 */
public abstract class AbstractMessage3 {
	/**
	 * ����һ��ʵ�ֲ��ֵĶ���
	 */
	protected MessageImplementor impl;
	/**
	 * ���췽��
	 */
	public AbstractMessage3(){
		//����һ��Ĭ�ϵ�ʵ��
		this.impl = new MessageSMS();
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

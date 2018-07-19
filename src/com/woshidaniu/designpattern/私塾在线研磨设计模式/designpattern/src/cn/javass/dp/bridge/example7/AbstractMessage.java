package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.bridge.example7;

/**
 * �������Ϣ����
 */
public abstract class AbstractMessage {
	/**
	 * ����һ��ʵ�ֲ��ֵĶ���
	 */
	protected MessageImplementor impl;
	/**
	 * ���췽��������ѡ��ʵ�ֲ��ֵ����� 
	 * @param type ����ѡ��ʵ�ֲ��ֵ�����
	 */
	public AbstractMessage(int type){
		if(type==1){
			this.impl = new MessageSMS();
		}else if(type==2){
			this.impl = new MessageEmail();
		}else if(type==3){
			this.impl = new MessageMobile();
		}
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

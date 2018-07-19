package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.bridge.example7;
/**
 * ���ֻ�����Ϣ�ķ�ʽ������Ϣ
 */
public  class MessageMobile implements MessageImplementor{

	public void send(String message, String toUser) {
		System.out.println("ʹ���ֻ�����Ϣ�ķ�ʽ��������Ϣ'"+message+"'��"+toUser);
	}
}

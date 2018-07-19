package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.bridge.example1;
/**
 * ��վ�ڶ���Ϣ�ķ�ʽ������ͨ��Ϣ
 */
public  class CommonMessageSMS implements Message{

	public void send(String message, String toUser) {
		System.out.println("ʹ��վ�ڶ���Ϣ�ķ�ʽ��������Ϣ'"+message+"'��"+toUser);
	}

}

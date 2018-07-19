package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.bridge.example3;
/**
 * ��Email�ķ�ʽ������ͨ��Ϣ
 */
public class CommonMessageEmail implements Message{

	public void send(String message, String toUser) {
		System.out.println("ʹ��Email�ķ�ʽ��������Ϣ'"+message+"'��"+toUser);
	}

}
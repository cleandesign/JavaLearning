package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.bridge.example4;

public class UrgencyMessageSMS implements UrgencyMessage{
	public void send(String message, String toUser) {
		message = "�Ӽ���"+message;
		System.out.println("ʹ��վ�ڶ���Ϣ�ķ�ʽ��������Ϣ'"+message+"'��"+toUser);
	}

	public Object watch(String messageId) {
		//��ȡ��Ӧ�����ݣ���֯�ɼ�ص����ݶ���Ȼ�󷵻�		
		return null;
	}	
}

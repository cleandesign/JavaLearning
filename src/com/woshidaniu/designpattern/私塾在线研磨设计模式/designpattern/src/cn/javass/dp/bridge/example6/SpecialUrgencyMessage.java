package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.bridge.example6;
/**
 * �ؼ���Ϣ
 */
public class SpecialUrgencyMessage extends AbstractMessage{

	public SpecialUrgencyMessage(MessageImplementor impl) {
		super(impl);
	}

	public void hurry(String messageId) {
		//ִ�дߴٵ�ҵ�񣬷����ߴٵ���Ϣ
	}

	public void sendMessage(String message, String toUser) {
		message = "�ؼ���"+message;
		super.sendMessage(message, toUser);
		//����Ҫ����һ�����ߴٵ���Ϣ
	}
}

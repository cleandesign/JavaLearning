package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.bridge.example7;
/**
 * ʵ�ַ�����Ϣ��ͳһ�ӿ�
 */
public interface MessageImplementor {
	/**
	 * ������Ϣ
	 * @param message Ҫ���͵���Ϣ����
	 * @param toUser ����Ϣ���͵�Ŀ����Ա
	 */
	public void send(String message, String toUser);
}

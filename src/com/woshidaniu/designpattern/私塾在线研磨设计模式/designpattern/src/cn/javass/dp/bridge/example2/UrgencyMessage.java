package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.bridge.example2;
/**
 * �Ӽ���Ϣ�ĳ���ӿ�
 */
public interface UrgencyMessage extends Message{
	/**
	 * ���ĳ��Ϣ�Ĵ������
	 * @param messageId ����ص���Ϣ�ı��
	 * @return ������ص������ݶ�������ʾ��һ�£���������Object
	 */
	public Object watch(String messageId);
}

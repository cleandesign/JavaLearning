package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.bridge.example6;
/**
 * �Ӽ���Ϣ
 */
public class UrgencyMessage extends AbstractMessage{
	public UrgencyMessage(MessageImplementor impl) {
		super(impl);
	}
	public void sendMessage(String message, String toUser) {
		message = "�Ӽ���"+message;
		super.sendMessage(message, toUser);
	}
	/**
	 * ���ĳ��Ϣ�Ĵ������
	 * @param messageId ����ص���Ϣ�ı��
	 * @return ������ص������ݶ�������ʾ��һ�£���������Object
	 */
	public Object watch(String messageId) {
		//��ȡ��Ӧ�����ݣ���֯�ɼ�ص����ݶ���Ȼ�󷵻�		
		return null;
	}	
}
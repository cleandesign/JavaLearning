package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.chainofresponsibility.example4;

/**
 * ����ְ�����Ľӿ�
 */
public abstract class Handler {
	/**
	 * ������һ����������Ķ���
	 */
	protected Handler successor = null;
	/**
	 * ������һ����������Ķ���
	 * @param successor ��һ����������Ķ���
	 */
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
	/**
	 * ����۲ͷ��õ�����
	 * @param user ������
	 * @param fee �����Ǯ��
	 * @return �ɹ���ʧ�ܵľ���֪ͨ
	 */
	public abstract String handleFeeRequest(String user,double fee);
	/**
	 * ����Ԥ֧���÷��õ�����
	 * @param user ������
	 * @param requestFee �����Ǯ��
	 * @return �Ƿ�ͬ��
	 */
	public abstract boolean handlePreFeeRequest(String user,double requestFee);
}

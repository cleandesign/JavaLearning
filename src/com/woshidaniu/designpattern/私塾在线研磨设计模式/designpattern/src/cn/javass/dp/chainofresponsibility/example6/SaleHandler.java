package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.chainofresponsibility.example6;
/**
 * ����ְ�����Ľӿ�
 */
public abstract class SaleHandler {
	/**
	 * ������һ����������Ķ���
	 */
	protected SaleHandler successor = null;
	/**
	 * ������һ����������Ķ���
	 * @param successor ��һ����������Ķ���
	 */
	public void setSuccessor(SaleHandler successor){
		this.successor = successor;
	}
	/**
	 * ������������Ϣ������
	 * @param user ������Ա
	 * @param customer �ͻ�
	 * @param saleModel ��������
	 * @return �Ƿ���ɹ�
	 */
	public abstract boolean sale(String user,String customer,SaleModel saleModel);
}

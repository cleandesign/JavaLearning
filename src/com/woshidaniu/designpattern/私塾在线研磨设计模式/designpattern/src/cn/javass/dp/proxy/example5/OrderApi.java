package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.proxy.example5;

/**
 * ��������Ľӿڶ���
 */
public interface OrderApi {
	/**
	 * ��ȡ���������Ĳ�Ʒ����
	 * @return ���������Ĳ�Ʒ����
	 */
	public String getProductName();
	/**
	 * ���ö��������Ĳ�Ʒ����
	 * @param productName ���������Ĳ�Ʒ����
	 * @param user ������Ա
	 */
	public void setProductName(String productName, String user);
	/**
	 * ��ȡ��������������
	 * @return ��������������
	 */
	public int getOrderNum();
	/**
	 * ���ö�������������
	 * @param orderNum ��������������
	 * @param user ������Ա
	 */
	public void setOrderNum(int orderNum, String user);
	/**
	 * ��ȡ������������Ա
	 * @return ������������Ա
	 */
	public String getOrderUser();
	/**
	 * ���ô�����������Ա
	 * @param orderUser ������������Ա
	 * @param user ������Ա
	 */
	public void setOrderUser(String orderUser, String user);
}
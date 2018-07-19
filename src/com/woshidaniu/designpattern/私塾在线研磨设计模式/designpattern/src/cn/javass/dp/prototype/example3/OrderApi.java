package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.prototype.example3;


/**
 * �����Ľӿڣ������˿��Կ�¡����ķ���
 */
public interface OrderApi {
	/**
	 * ��ȡ������Ʒ����
	 * @return �����в�Ʒ����
	 */
	public int getOrderProductNum();
	/**
	 * ���ö�����Ʒ����
	 * @param num ������Ʒ����
	 */
	public void setOrderProductNum(int num);
	/**
	 * ��¡����
	 * @return ����ԭ�͵�ʵ��
	 */
	public OrderApi cloneOrder();
}

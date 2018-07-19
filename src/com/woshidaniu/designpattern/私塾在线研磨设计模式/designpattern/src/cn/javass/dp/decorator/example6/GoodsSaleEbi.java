package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.decorator.example6;
/**
 * ��Ʒ���۹����ҵ��ӿ�
 */
public interface GoodsSaleEbi {
	/**
	 * ����������Ϣ��������������Ӧ���Ƕ�����̫�鷳�ˣ�Ϊ����ʾ���򵥵�
	 * @param user ������Ա
	 * @param customer �ͻ�
	 * @param saleModel ��������
	 * @return �Ƿ񱣴�ɹ�
	 */
	public boolean sale(String user, String customer, SaleModel saleModel);
}

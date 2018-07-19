package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.abstractfactory.example5;
/**
 * ���󹤳����������������Ӽ�¼��Ӧ��DAO����
 */
public abstract class DAOFactory {
	/**
	 * ������������¼��Ӧ��DAO����
	 * @return ��������¼��Ӧ��DAO����
	 */
	public abstract OrderMainDAO createOrderMainDAO();
	/**
	 * ���������Ӽ�¼��Ӧ��DAO����
	 * @return �����Ӽ�¼��Ӧ��DAO����
	 */
	public abstract OrderDetailDAO createOrderDetailDAO();
}

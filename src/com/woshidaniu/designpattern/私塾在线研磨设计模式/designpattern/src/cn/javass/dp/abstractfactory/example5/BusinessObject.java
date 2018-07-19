package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.abstractfactory.example5;

public class BusinessObject {
	public static void main(String[] args) {
		//����DAO�ĳ��󹤳�
		DAOFactory df = new RdbDAOFactory();
		//ͨ�����󹤳�����ȡ��Ҫ��DAO�ӿ�
		OrderMainDAO mainDAO = df.createOrderMainDAO();
		OrderDetailDAO detailDAO = df.createOrderDetailDAO();
		//����DAO��������ݴ洢�Ĺ���
		mainDAO.saveOrderMain();
		detailDAO.saveOrderDetail();
	}
}

package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.chainofresponsibility.example6;
/**
 * �����������۵�ҵ���ܵ�ְ�����
 */
public class SaleMgr extends SaleHandler{
	public boolean sale(String user, String customer, SaleModel saleModel) {
		//����������ҵ���߼�����
		System.out.println(user+"������"+customer+"���� "+saleModel+" ����������");
		return true;
	}
}

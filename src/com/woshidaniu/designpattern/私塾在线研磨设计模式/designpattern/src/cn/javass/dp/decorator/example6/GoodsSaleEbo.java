package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.decorator.example6;

public class GoodsSaleEbo implements GoodsSaleEbi{
	
	public boolean sale(String user,String customer, SaleModel saleModel) {
		System.out.println(user+"������"+customer+"���� "+saleModel+" ����������");
		return true;
	}
}

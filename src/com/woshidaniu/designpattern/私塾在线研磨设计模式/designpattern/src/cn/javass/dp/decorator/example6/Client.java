package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.decorator.example6;

public class Client {
	public static void main(String[] args) {
		//�õ�ҵ��ӿ�,���װ����
		GoodsSaleEbi ebi = new CheckDecorator(new LogDecorator(new GoodsSaleEbo()));
		//׼����������
		SaleModel saleModel = new SaleModel();
		saleModel.setGoods("Moto�ֻ�");
		saleModel.setSaleNum(2);
		//����ҵ����
		ebi.sale("����","������", saleModel);
		ebi.sale("����","������", saleModel);
	}
}

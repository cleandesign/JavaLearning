package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.factorymethod.example3;

public class Client {
	public static void main(String[] args) {
		//������Ҫʹ�õ�Creator����
		ExportOperate operate = new ExportDBOperate();
		//����������ݵĹ��ܷ���
		operate.export("��������");
	}
}

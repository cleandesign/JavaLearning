package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.factorymethod.example1;

public class Client {
	public static void main(String[] args) {
		ExportOperate operate = new ExportOperate();
		operate.export(2, "��������");
	}
}

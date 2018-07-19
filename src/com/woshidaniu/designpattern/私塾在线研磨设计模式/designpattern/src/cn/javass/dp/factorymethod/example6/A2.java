package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.factorymethod.example6;

public class A2 extends A1 {
	protected C1 createC1() {
		//������ѡ�����ʵ�֣�����������
		return new C2();
	}
}

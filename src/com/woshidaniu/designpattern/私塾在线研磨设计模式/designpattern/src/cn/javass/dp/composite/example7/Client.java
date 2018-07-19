package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.composite.example7;

public class Client {
	public static void main(String[] args) {
		//�������е���϶���
		Component root = new Composite("��װ");
		Component c1 = new Composite("��װ");
		Component c2= new Composite("����");
		Component c3= new Composite("��װ");
		//����һ����״����
		root.addChild(c1);
		c1.addChild(c2);
		c2.addChild(c3);
		
		//���ø������������������������
		root.printStruct("");
	}
}

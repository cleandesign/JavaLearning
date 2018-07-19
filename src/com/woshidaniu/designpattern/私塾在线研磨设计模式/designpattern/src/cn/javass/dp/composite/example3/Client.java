package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.composite.example3;

public class Client {
	public static void main(String[] args) {
		//�������е���϶���
		Component root = new Composite("��װ");
		Component c1 = new Composite("��װ");
		Component c2 = new Composite("Ůװ");
		//�������е�Ҷ�Ӷ���
		Component leaf1 = new Leaf("����");
		Component leaf2 = new Leaf("�п�");
		Component leaf3 = new Leaf("ȹ��");
		Component leaf4 = new Leaf("��װ");
		//�������Ľṹ�������϶����Ҷ�Ӷ���
		root.addChild(c1);
		root.addChild(c2);
		
		c1.addChild(leaf1);
		c1.addChild(leaf2);
		
		c2.addChild(leaf3);
		c2.addChild(leaf4);
		
		//���ø������������������������
		root.printStruct("");
	}
}

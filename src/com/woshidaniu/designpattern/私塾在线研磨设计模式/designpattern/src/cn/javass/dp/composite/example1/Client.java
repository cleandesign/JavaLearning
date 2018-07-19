package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.composite.example1;

public class Client {
	public static void main(String[] args) {
		//�������е���϶���
		Composite root = new Composite("��װ");
		Composite c1 = new Composite("��װ");
		Composite c2 = new Composite("Ůװ");
		//�������е�Ҷ�Ӷ���
		Leaf leaf1 = new Leaf("����");
		Leaf leaf2 = new Leaf("�п�");
		Leaf leaf3 = new Leaf("ȹ��");
		Leaf leaf4 = new Leaf("��װ");
		//�������Ľṹ�������϶����Ҷ�Ӷ���
		root.addComposite(c1);
		root.addComposite(c2);
		
		c1.addLeaf(leaf1);
		c1.addLeaf(leaf2);
		
		c2.addLeaf(leaf3);
		c2.addLeaf(leaf4);
		
		//���ø������������������������
		root.printStruct("");
	}
}

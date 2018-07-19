package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.prototype.example8;

public class Client {
	public static void main(String[] args) {
		try {
			// ��ʼ��ԭ�͹�����
			Prototype p1 = new ConcretePrototype1();
			PrototypeManager.setPrototype("Prototype1", p1);

			// ��ȡԭ������������
			Prototype p3 = PrototypeManager.getPrototype("Prototype1").clone();
			p3.setName("����");
			System.out.println("��һ��ʵ����" + p3);

			// ���˶�̬���л���ʵ��
			Prototype p2 = new ConcretePrototype2();
			PrototypeManager.setPrototype("Prototype1", p2);

			// ���»�ȡԭ������������
			Prototype p4 = PrototypeManager.getPrototype("Prototype1").clone();
			p4.setName("����");
			System.out.println("�ڶ���ʵ����" + p4);

			// ����ע�������ԭ��
			PrototypeManager.removePrototype("Prototype1");

			// �ٴλ�ȡԭ������������
			Prototype p5 = PrototypeManager.getPrototype("Prototype1").clone();
			p5.setName("����");
			System.out.println("������ʵ����" + p5);
		} catch (Exception err) {
			System.err.println(err.getMessage());
		}
	}
}
package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.proxy.example4;

public class Client {
	public static void main(String[] args) {
		//�����ȵ�¼ϵͳ������һ������
		OrderApi order = new OrderProxy(new Order("���ģʽ",100,"����"));
		//������Ҫ���޸ģ��Ǿͻᱨ��
		order.setOrderNum(123, "����");
		//���order
		System.out.println("�����޸ĺ󶩵���¼û�б仯��"+order);
		//�����޸ľͲ���������
		order.setOrderNum(123, "����");
		//�ٴ����order
		System.out.println("�����޸ĺ󣬶�����¼��"+order);
	}
}

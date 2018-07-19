package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.prototype.example5;

public class Client {
	public static void main(String[] args) {
		//�ȴ���ԭ��ʵ��
		PersonalOrder oa1 = new PersonalOrder();
		
		//����ԭ��ʵ���Ķ���������ֵ
		oa1.setOrderProductNum(100);
		//Ϊ�˼򵥣���������������
	    System.out.println("���ǵ�һ�λ�ȡ�Ķ���ʵ��==="+oa1.getOrderProductNum());
	    
		//ͨ����¡����ȡ�µ�ʵ��
	    PersonalOrder oa2 = (PersonalOrder)oa1.clone();
		//�޸���������
		oa2.setOrderProductNum(80);
		//�����¡�����Ķ����ֵ
		System.out.println("�����¡������ʵ��==="+oa2.getOrderProductNum());
		
		//�ٴ����ԭ��ʵ����ֵ
		System.out.println("�ٴ����ԭ��ʵ��==="+oa1.getOrderProductNum());	
	}
}

package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.abstractfactory.example3;

public class Client {
	public static void main(String[] args) {
		//����װ������ʦ����
		ComputerEngineer engineer = new ComputerEngineer();
		//�ͻ�ѡ�񲢴�����Ҫʹ�õ�װ����������
		AbstractFactory schema = new Schema1();
		//����װ������ʦ�Լ�ѡ���װ����������װ������ʦ��װ����
		engineer.makeComputer(schema);
	}
}

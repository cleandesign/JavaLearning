package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.abstractfactory.example1;

public class Client {
	public static void main(String[] args) {
		//����װ������ʦ����
		ComputerEngineer engineer = new ComputerEngineer();
		//����װ������ʦ�Լ�ѡ����������װ������ʦ��װ����
		engineer.makeComputer(1,2);
	}
}

package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example8;

public class Client {
	public static void main(String[] args) {
		//׼��Ҫ����������
		Command cmd = new PrintService("�˻�������ģʽʾ��");
		//���������������
		Invoker invoker = new Invoker();
		invoker.setCmd(cmd);
		
		//���°�ť����������ִ������
		invoker.startPrint();
	}
}
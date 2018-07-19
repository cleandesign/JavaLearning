package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example1;

public class Client {
	/**
	 * ʾ�⣬���𴴽�������󣬲��趨���Ľ�����
	 */
	public void assemble(){
		//����������
		Receiver receiver = new Receiver();
		//������������趨���Ľ�����
		Command command = new ConcreteCommand(receiver);
		//����Invoker��������������ý�ȥ
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
	}
}

package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example1;
/**
 * ������
 */
public class Invoker {
	/**
	 * �����������
	 */
	private Command command = null;
	/**
	 * ���õ����߳��е��������
	 * @param command �������
	 */
	public void setCommand(Command command) {
		this.command = command;
	}
	/**
	 * ʾ�ⷽ����Ҫ������ִ������
	 */
	public void runCommand() {
		//������������ִ�з���
		command.execute();
	}
}

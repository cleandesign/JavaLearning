package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example1;
/**
 * ���������ʵ�ֶ���
 */
public class ConcreteCommand implements Command {
	/**
	 * ������Ӧ�Ľ����߶���
	 */
	private Receiver receiver = null;
	/**
	 * ʾ�⣬�������������Լ���״̬
	 */
	private String state;
	/**
	 * ���췽����������Ӧ�Ľ����߶���
	 * @param receiver ��Ӧ�Ľ����߶���
	 */
	public ConcreteCommand(Receiver receiver){
		this.receiver = receiver;
	}
	
	public void execute() {
		//ͨ����ת�������߶������Ӧ�������ý�����������ִ�й���
		receiver.action();
	}

}

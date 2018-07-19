package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example2;
/**
 * ������󣬱����а�ť�����а�ť��Ӧ���������
 */
public class Box {
	/**
	 * �����������
	 */
	private Command openCommand;
	/**
	 * ���ÿ����������
	 * @param command �����������
	 */
	public void setOpenCommand(Command command){
		this.openCommand = command;
	}
	/**
	 * �ṩ���ͻ�ʹ�ã����ܲ���Ӧ�û������൱�ڰ�ť�����´����ķ���
	 */
	public void openButtonPressed(){
		//���°�ť��ִ������
		openCommand.execute();
	}
}

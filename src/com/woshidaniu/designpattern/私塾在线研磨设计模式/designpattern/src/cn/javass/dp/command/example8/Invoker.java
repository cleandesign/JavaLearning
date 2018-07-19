package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example8;

public class Invoker {
	/**
	 * �����������
	 */
	private Command cmd = null;
	/**
	 * �����������
	 * @param cmd �������
	 */
	public void setCmd(Command cmd){
		this.cmd = cmd;
	}
	/**
	 * ��ʼ��ӡ
	 */
	public void startPrint(){
		//ִ������Ĺ���
		this.cmd.execute();
	}
}
package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example4;
/**
 * ����ӿڣ�����ִ�еĲ�����֧�ֿɳ�������
 */
public interface Command {
	/**
	 * ִ�������Ӧ�Ĳ���
	 */
	public void execute();
	/**
	 * ִ�г��������Ӧ�Ĳ���
	 */
	public void undo();
}

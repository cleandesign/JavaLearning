package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example6;
import java.util.*;
/**
 * ����Ա��������ϲ˵�,������ִ�е���
 */
public class Waiter {
	/**
	 * ����һ����������󡪡��˵�
	 */
	private MenuCommand menuCommand = new MenuCommand();
	/**
	 * �ͻ����
	 * @param cmd �ͻ���Ĳˣ�ÿ������һ���������
	 */
	public void orderDish(Command cmd){
		//��ӵ��˵���
		menuCommand.addCommand(cmd);
	}
	/**
	 * �ͻ������ϣ���ʾҪִ�������ˣ��������ִ�в˵�����������
	 */
	public void orderOver(){
		this.menuCommand.execute();
	}
}

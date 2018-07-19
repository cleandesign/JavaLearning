package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example3;
/**
 * ���������ʵ�֣�ʵ��Command�ӿڣ�
 * ���п������������ʵ�֣�ͨ�����ý����ߵķ�����ʵ������
 */
public class OpenCommand implements Command{
	/**
	 * ��������ʵ������Ľ����ߡ����������
	 */
	private MainBoardApi mainBoard = null;
	/**
	 * ���췽���������������
	 * @param mainBoard �������
	 */
	public OpenCommand(MainBoardApi mainBoard) {
		this.mainBoard = mainBoard;
	}
	
	public void execute() {
		//����������󣬸�����֪����ο�������ת���������
		//������ȥ��ɿ����Ĺ���
		this.mainBoard.open();
	}
}

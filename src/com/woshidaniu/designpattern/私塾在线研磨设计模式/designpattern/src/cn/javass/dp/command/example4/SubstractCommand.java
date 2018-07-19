package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example4;
/**
 * ����ļ�������ʵ�ֶ���
 */
public class SubstractCommand implements Command{
	/**
	 * ���о���ִ�м���Ķ���
	 */
	private OperationApi operation = null;
	/**
	 * ���������ݣ�Ҳ����Ҫ��ȥ������
	 */
	private int opeNum;
	/**
	 * ���췽�����������ִ�м���Ķ���
	 * @param operation ����ִ�м���Ķ���
	 * @param opeNum Ҫ��ȥ������
	 */
	public SubstractCommand(OperationApi operation,int opeNum){
		this.operation = operation;
		this.opeNum = opeNum;
	}	
	
	public void execute() {
		//ת��������ȥ����ִ�й��ܣ����������������
		this.operation.substract(opeNum);
	}
	
	public void undo() {
		//ת��������ȥ����ִ�й���
		//�����������������ô������ʱ��������ӷ���
		this.operation.add(opeNum);
	}
}

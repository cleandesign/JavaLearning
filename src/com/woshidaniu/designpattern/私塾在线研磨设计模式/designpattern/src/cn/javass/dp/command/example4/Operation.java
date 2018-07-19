package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example4;
/**
 * �����࣬����ʵ�ּӼ�������
 */
public class Operation implements OperationApi{
	/**
	 * ��¼����Ľ��
	 */
	private int result;
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	public void add(int num){
		//ʵ�ּӷ�����
		result += num;
	}
	public void substract(int num){
		//ʵ�ּ�������
		result -= num;
	}
}

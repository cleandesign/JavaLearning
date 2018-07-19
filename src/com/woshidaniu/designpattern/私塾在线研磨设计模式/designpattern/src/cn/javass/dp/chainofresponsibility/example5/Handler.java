package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.chainofresponsibility.example5;
/**
 * ����ְ�����Ľӿ�
 */
public abstract class Handler {
	/**
	 * ������һ����������Ķ���
	 */
	protected Handler successor = null;
	/**
	 * ������һ����������Ķ���
	 * @param successor ��һ����������Ķ���
	 */
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
	/**
	 * ͨ�õ���������
	 * @param rm ͨ�õ��������
	 * @return �������Ҫ���صĶ���
	 */
	public Object handleRequest(RequestModel rm){
		if(successor != null){
			//�����Ĭ�ϵ�ʵ�֣�������಻Ը�⴦����������Ǿʹ��ݵ���һ��ְ�����ȥ����
			return this.successor.handleRequest(rm);
		}else{
			System.out.println("û�к������������ʱ��֧�������Ĺ��ܴ���");
			return false;
		}
	}
}

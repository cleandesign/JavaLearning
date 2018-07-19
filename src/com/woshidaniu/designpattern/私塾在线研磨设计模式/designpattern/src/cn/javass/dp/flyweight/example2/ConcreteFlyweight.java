package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.flyweight.example2;
/**
 * ��Ԫ����
 */
public class ConcreteFlyweight implements Flyweight{
	/**
	 * ʾ���������ڲ�״̬
	 */
	private String intrinsicState;
	/**
	 * ���췽����������Ԫ������ڲ�״̬������
	 * @param state ��Ԫ������ڲ�״̬������
	 */
	public ConcreteFlyweight(String state){
		this.intrinsicState = state;
	}
	public void operation(String extrinsicState) {
		//����Ĺ��ܴ������ܻ��õ���Ԫ�ڲ����ⲿ��״̬
	}	
}

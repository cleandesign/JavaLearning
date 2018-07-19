package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example3;
/**
 * ����Ԫ�ص�ʵ�ֶ���
 */
public class ConcreteElementB extends Element {
	public void accept(Visitor visitor) {
		//�ص������߶������Ӧ����
		visitor.visitConcreteElementB(this);
	}
	/**
	 * ʾ����������ʾԪ�����еĹ���ʵ��
	 */
	public void opertionB(){
		//���еĹ���ʵ��
	}
}


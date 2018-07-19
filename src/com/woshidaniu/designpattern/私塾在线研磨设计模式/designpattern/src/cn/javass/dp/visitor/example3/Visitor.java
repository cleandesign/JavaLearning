package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example3;
/**
 * �����߽ӿ�
 */
public interface Visitor {
	/**
	 * ����Ԫ��A���൱�ڸ�Ԫ��A��ӷ����ߵĹ���
	 * @param elementA Ԫ��A�Ķ���
	 */
	public void visitConcreteElementA(ConcreteElementA elementA);
	/**
	 * ����Ԫ��B���൱�ڸ�Ԫ��B��ӷ����ߵĹ���
	 * @param elementB Ԫ��B�Ķ���
	 */
	public void visitConcreteElementB(ConcreteElementB elementB);
}


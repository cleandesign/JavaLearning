package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example3;
/**
 * �����ʵ�Ԫ�صĽӿ�
 */
public abstract class Element {
	/**
	 * ���ܷ����ߵķ���
	 * @param visitor �����߶���
	 */
	public abstract void accept(Visitor visitor);
}


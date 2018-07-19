package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example6;

import java.util.Iterator;

/**
 * �������������൱�ڷ�����ģʽ�е�Ԫ�ض���
 */
public abstract class Component {
	/**
	 * ���ܷ����ߵķ���
	 * @param visitor �����߶���
	 */
	public abstract void accept(Visitor visitor);

	/**
	 * ����϶����м���������� 
	 * @param child ��������϶����е��������
	 */
	public void addChild(Component child) {
		// ȱʡ��ʵ�֣��׳����⣬��ΪҶ�Ӷ���û��������ܣ����������û��ʵ���������
		throw new UnsupportedOperationException("����֧���������");
	}
	/**
	 * ����϶������Ƴ�ĳ���������
	 * @param child ���Ƴ����������
	 */
	public void removeChild(Component child) {
		// ȱʡ��ʵ�֣��׳����⣬��ΪҶ�Ӷ���û��������ܣ����������û��ʵ���������
		throw new UnsupportedOperationException("����֧���������");
	}
	/**
	 * ����ĳ��������Ӧ������������û�ж�Ӧ���Ӷ��󣬾ͷ���null
	 * @param index ��Ҫ��ȡ����������������������0��ʼ
	 * @return ������Ӧ���������
	 */
	public Component getChildren(int index) {
		throw new UnsupportedOperationException("����֧���������");
	}
}


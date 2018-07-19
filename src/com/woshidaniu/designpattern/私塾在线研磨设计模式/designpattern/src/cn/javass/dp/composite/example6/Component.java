package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.composite.example6;

import java.util.Iterator;
import java.util.List;
/**
 * ������������
 */
public abstract class Component {
	/**
	 * ��¼���������
	 */
	private Component parent = null;
	
	/**
	 * ��ȡһ������ĸ��������
	 * @return һ������ĸ��������
	 */
	public Component getParent() {
		return parent;
	}
	/**
	 * ����һ������ĸ��������
	 * @param parent һ������ĸ��������
	 */
	public void setParent(Component parent) {
		this.parent = parent;
	}
	/**
	 * ����ĳ����������������
	 * @return ĳ����������������
	 */
	public List<Component> getChildren() {
		throw new UnsupportedOperationException("����֧���������");
	}
/*-------------------������ԭ�еĶ���----------------------*/	

	/**
	 * ���������������
	 */
	public abstract void printStruct(String preStr);

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
	 * ����ĳ��������Ӧ���������
	 * @param index ��Ҫ��ȡ����������������������0��ʼ
	 * @return ������Ӧ���������
	 */
	public Component getChildren(int index) {
		throw new UnsupportedOperationException("����֧���������");
	}
}


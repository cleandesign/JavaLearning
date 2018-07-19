package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.factorymethod.example2;
/**
 * ��������������������
 */
public abstract class Creator {
	/**
	 * ����Product�Ĺ�������
	 * @return Product����
	 */
	protected abstract Product factoryMethod();
	/**
	 * ʾ�ⷽ����ʵ��ĳЩ���ܵķ��� 
	 */
	public void someOperation() {
		//ͨ������Щ����ʵ���У���Ҫ���ù�����������ȡProduct����
		Product product = factoryMethod();
	}

}


package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.abstractfactory.example4;

/**
 * ����չ�ĳ��󹤳��Ľӿ�
 */
public interface AbstractFactory {
	/**
	 * һ��ͨ�õĴ�����Ʒ����ķ�����Ϊ�˼򵥣�ֱ�ӷ���Object
	 * Ҳ����Ϊ���б������Ĳ�Ʒ����һ�������Ľӿ�
	 * @param type ���崴���Ĳ�Ʒ���ͱ�ʶ
	 * @return �������Ĳ�Ʒ����
	 */
	public Object createProduct(int type);
}
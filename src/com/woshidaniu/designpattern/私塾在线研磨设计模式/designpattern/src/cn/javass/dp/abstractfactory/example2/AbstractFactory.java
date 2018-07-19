package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.abstractfactory.example2;
/**
 * ���󹤳��Ľӿڣ��������������Ʒ����Ĳ���
 */
public interface AbstractFactory {
	/**
	 * ʾ�����������������ƷA�Ķ���
	 * @return �����ƷA�Ķ���
	 */
	public AbstractProductA createProductA();
	/**
	 * ʾ�����������������ƷB�Ķ���
	 * @return �����ƷB�Ķ���
	 */
	public AbstractProductB createProductB();
}
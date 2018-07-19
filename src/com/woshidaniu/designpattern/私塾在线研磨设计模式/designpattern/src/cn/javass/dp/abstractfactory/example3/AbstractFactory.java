package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.abstractfactory.example3;
/**
 * ���󹤳��Ľӿڣ��������������Ʒ����Ĳ���
 */
public interface AbstractFactory {
	/**
	 * ����CPU�Ķ���
	 * @return CPU�Ķ���
	 */
	public CPUApi createCPUApi();
	/**
	 * ��������Ķ���
	 * @return ����Ķ���
	 */
	public MainboardApi createMainboardApi();
}
package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.simplefactory.example3;
/**
 * �����࣬��������Api����
 */
public class Factory {
	/**
	 * ����Ĵ���Api����ķ���
	 * @return ����õ�Api����
	 */
	public static Api createApi(){
		//����ֻ��һ��ʵ�֣��Ͳ��������ж���
		return new Impl();
	}
}

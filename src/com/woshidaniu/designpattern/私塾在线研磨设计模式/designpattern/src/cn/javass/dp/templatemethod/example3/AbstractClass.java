package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.templatemethod.example3;
/**
 * ����ģ�巽����ԭ������ȵĳ�����
 */
public abstract class AbstractClass {
	/**
	 * ԭ�����1����νԭ��������ǳ���Ĳ���������Ҫ�������ṩʵ��
	 */
	public abstract void doPrimitiveOperation1();
	/**
	 * ԭ�����2
	 */
	public abstract void doPrimitiveOperation2();
	/**
	 * ģ�巽���������㷨�Ǽ�
	 */
	public final void templateMethod() {
		doPrimitiveOperation1();
		doPrimitiveOperation2();
	}
}


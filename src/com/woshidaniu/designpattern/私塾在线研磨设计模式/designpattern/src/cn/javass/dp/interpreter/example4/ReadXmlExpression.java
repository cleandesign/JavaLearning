package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.interpreter.example4;

/**
 * ���ڴ����Զ���Xmlȡֵ���ʽ�Ľӿ�
 */
public abstract class ReadXmlExpression {
	/**
	 * ���ͱ��ʽ
	 * @param c ������
	 * @return ���������ֵ��Ϊ��ͨ�ã������ǵ���ֵ��Ҳ�����Ƕ��ֵ��
	 *         ��˾ͷ���һ������
	 */
	public abstract String[] interpret(Context c);
}


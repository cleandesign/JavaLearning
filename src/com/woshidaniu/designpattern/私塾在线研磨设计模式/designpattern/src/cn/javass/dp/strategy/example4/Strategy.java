package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.strategy.example4;

/**
 * ���ԣ�������㱨���㷨�Ľӿ�
 */
public interface Strategy {
	/**
	 * ����Ӧ���ļ۸�
	 * @param goodsPrice ��Ʒ����ԭ��
	 * @return ��������ģ�Ӧ�ø��ͻ����ļ۸�
	 */
	public double calcPrice(double goodsPrice);
}


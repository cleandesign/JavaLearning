package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.decorator.example6;
/**
 * װ�����Ľӿڣ���Ҫ����װ�εĶ���ʵ��ͬ���Ľӿ�
 */
public abstract class Decorator implements GoodsSaleEbi{
	/**
	 * ���б�װ�ε��������
	 */
	protected GoodsSaleEbi ebi;
	/**
	 * ͨ�����췽�����뱻װ�εĶ���
	 * @param ebi��װ�εĶ���
	 */
	public Decorator(GoodsSaleEbi ebi){
		this.ebi = ebi;
	}
}

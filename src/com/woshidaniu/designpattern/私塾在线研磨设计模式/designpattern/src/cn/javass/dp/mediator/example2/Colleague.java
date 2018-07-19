package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.mediator.example2;

/**
 * ͬ����ĳ�����
 */
public abstract class Colleague {
	/**
	 * �����н��߶���ÿһ��ͬ���඼֪�������н��߶���
	 */
	private Mediator mediator;
	/**
	 * ���췽���������н��߶���
	 * @param mediator �н��߶���
	 */
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	/**
	 * ��ȡ��ǰͬ�����Ӧ���н��߶���
	 * @return ��Ӧ���н��߶���
	 */
	public Mediator getMediator() {
		return mediator;
	}
}


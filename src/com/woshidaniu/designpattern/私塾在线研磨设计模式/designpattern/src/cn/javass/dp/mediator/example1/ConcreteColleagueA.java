package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.mediator.example1;
/**
 * �����ͬ����A
 */
public class ConcreteColleagueA extends Colleague {
	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}
	/**
	 * ʾ�ⷽ����ִ��ĳЩҵ����
	 */
	public void someOperation() {
		//����Ҫ������ͬ��ͨ�ŵ�ʱ��֪ͨ�н��߶���
		getMediator().changed(this);
	}
}
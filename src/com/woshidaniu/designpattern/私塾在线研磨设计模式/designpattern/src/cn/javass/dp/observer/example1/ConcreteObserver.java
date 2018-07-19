package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.observer.example1;

/**
 * ����۲��߶���ʵ�ָ��µķ�����ʹ�����״̬��Ŀ���״̬����һ��
 */
public class ConcreteObserver implements Observer {
	/**
	 * ʾ�⣬�����ߵ�״̬
	 */
	private String observerState;
	
	public void update(Subject subject) {
		// ����ĸ���ʵ��
		//���������Ҫ���¹۲��ߵ�״̬��ʹ����Ŀ���״̬����һ��
		observerState = ((ConcreteSubject)subject).getSubjectState();
	}
}


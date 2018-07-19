package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.observer.example1;

/**
 * �����Ŀ����󣬸�����й�״̬���뵽��Ӧ�Ĺ۲��߶���
 * �����Լ�״̬�����ı�ʱ��֪ͨ�����۲���
 */
public class ConcreteSubject extends Subject {
	/**
	 * ʾ�⣬Ŀ������״̬
	 */
	private String subjectState;
	public String getSubjectState() {
		return subjectState;
	}
	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		//״̬�����˸ı䣬֪ͨ�����۲���
		this.notifyObservers();
	}
}


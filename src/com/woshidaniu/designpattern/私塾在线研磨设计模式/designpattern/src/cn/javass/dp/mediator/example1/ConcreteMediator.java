package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.mediator.example1;
/**
 * ������н���ʵ��
 */
public class ConcreteMediator implements Mediator {
	
	/**
	 * ���в�ά��ͬ��A
	 */
	private ConcreteColleagueA colleagueA;
	/**
	 * ���в�ά��ͬ��B
	 */
	private ConcreteColleagueB colleagueB;
	
	/**
	 * �����н�����Ҫ�˽Ⲣά����ͬ��A����
	 * @param colleague ͬ��A����
	 */
	public void setConcreteColleagueA(ConcreteColleagueA colleague) {
		colleagueA = colleague;
	}
	/**
	 * �����н�����Ҫ�˽Ⲣά����ͬ��B����
	 * @param colleague ͬ��B����
	 */
	public void setConcreteColleagueB(ConcreteColleagueB colleague) {
		colleagueB = colleague;
	}
	
	public void changed(Colleague colleague) {
		//ĳ��ͬ���෢���˱仯��ͨ����Ҫ������ͬ�½���
		//����Э����Ӧ��ͬ�¶�����ʵ��Э����Ϊ
	}

}

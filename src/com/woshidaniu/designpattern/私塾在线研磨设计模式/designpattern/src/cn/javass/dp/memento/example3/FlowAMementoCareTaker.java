package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.memento.example3;


/**
 * ���𱣴�ģ����������A�Ķ���ı���¼����
 */
public class FlowAMementoCareTaker {
	/**
	 * ��¼������ı���¼����
	 */
	private FlowAMockMemento memento = null;
	/**
	 * ���汸��¼����
	 * @param memento ������ı���¼����
	 */
	public void saveMemento(FlowAMockMemento memento){
		this.memento = memento;
	}
	/**
	 * ��ȡ������ı���¼����
	 * @return ������ı���¼����
	 */
	public FlowAMockMemento retriveMemento(){
		return this.memento;
	}
}

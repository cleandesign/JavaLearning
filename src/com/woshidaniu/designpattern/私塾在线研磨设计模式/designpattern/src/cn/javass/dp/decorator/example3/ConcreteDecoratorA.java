package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.decorator.example3;

/**
 * װ�����ľ���ʵ�ֶ���������������ְ��
 */
public class ConcreteDecoratorA extends Decorator {
	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	/**
	 * ��ӵ�״̬
	 */
	private String addedState;
	
	public String getAddedState() {
		return addedState;
	}

	public void setAddedState(String addedState) {
		this.addedState = addedState;
	}

	public void operation() {
		//���ø���ķ����������ڵ���ǰ��ִ��һЩ���Ӷ���
		//��������д����ʱ�򣬿���ʹ����ӵ�״̬
		super.operation();
	}
}


package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.decorator.example3;

/**
 * װ�����ľ���ʵ�ֶ���������������ְ��
 */
public class ConcreteDecoratorB extends Decorator {
	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	/**
	 * ��Ҫ��ӵ�ְ��
	 */
	private void addedBehavior() {
		//��Ҫ��ӵ�ְ��ʵ��
	}
	public void operation() {
		//���ø���ķ����������ڵ���ǰ��ִ��һЩ���Ӷ���
		super.operation();
		addedBehavior();
	}
}


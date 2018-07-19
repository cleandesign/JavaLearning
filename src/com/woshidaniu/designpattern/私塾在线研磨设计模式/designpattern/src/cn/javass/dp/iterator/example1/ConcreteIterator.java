package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.iterator.example1;

/**
 * ���������ʵ�ֶ���ʾ����Ǿۺ϶���Ϊ����ĵ�����
 * ��ͬ�ľۺ϶�����Ӧ�ĵ�����ʵ���ǲ�һ����
 */
public class ConcreteIterator implements Iterator {
	/**
	 * ���б������ľ���ľۺ϶���
	 */
	private ConcreteAggregate aggregate;
	/**
	 * �ڲ���������¼��ǰ������������λ�á�
	 * -1��ʾ�տ�ʼ��ʱ�򣬵�����ָ��ۺ϶����һ������֮ǰ
	 */
	private int index = -1;
	/**
	 * ���췽�������뱻�����ľ���ľۺ϶���
	 * @param aggregate �������ľ���ľۺ϶���
	 */
	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	public void first(){
		index = 0;
	}
	public void next(){
		if(index < this.aggregate.size()){
			index = index + 1;
		}
	}
	public boolean isDone(){
		if(index == this.aggregate.size()){
			return true;
		}
		return false;
	}
	public Object currentItem(){
		return this.aggregate.get(index);
	}
}
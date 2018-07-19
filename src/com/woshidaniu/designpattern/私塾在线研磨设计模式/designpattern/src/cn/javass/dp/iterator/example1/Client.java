package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.iterator.example1;

public class Client {
	/**
	 * ʾ�ⷽ����ʹ�õ������Ĺ��ܡ�
	 * ����ʾ��ʹ�õ������������ۺ϶���
	 */
	public void someOperation(){
		String[] names = {"����","����","����"};
		//�����ۺ϶���
		Aggregate aggregate = new ConcreteAggregate(names);
		//ѭ������ۺ϶����е�ֵ
		Iterator it = aggregate.createIterator();
		//�������õ���������һ��Ԫ��
		it.first();
		while(!it.isDone()){
			//ȡ����ǰ��Ԫ����
			Object obj = it.currentItem();
			System.out.println("the obj=="+obj);
			//�����û�е����������ô�����µ���һ��
			it.next();
		}
	}	
	public static void main(String[] args) {
		//���Լ򵥵Ĳ���һ��
		Client client = new Client();
		client.someOperation();
	}
}

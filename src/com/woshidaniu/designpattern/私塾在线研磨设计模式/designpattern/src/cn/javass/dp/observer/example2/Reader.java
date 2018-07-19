package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.observer.example2;
/**
 * �����Ķ��ߣ�Ϊ�˼򵥾�����һ������
 */
public class Reader implements Observer{
	/**
	 * ���ߵ�����
	 */
	private String name;

	public void update(Subject subject) {
		//���ǲ������ķ�ʽ
		System.out.println(name+"�յ���ֽ�ˣ��Ķ��ȡ�������==="+((NewsPaper)subject).getContent());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

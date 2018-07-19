package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.observer.example4;

import java.util.Observable;

/**
 * �����Ķ��ߣ�Ϊ�˼򵥾�����һ������
 */
public class Reader implements java.util.Observer{
	/**
	 * ���ߵ�����
	 */
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void update(Observable o, Object obj) {
		//���ǲ����Ƶķ�ʽ
		System.out.println(name+"�յ���ֽ�ˣ��Ķ��ȡ�Ŀ���ƹ�����������==="+obj);
		//���ǻ�ȡ��������
		System.out.println(name+"�յ���ֽ�ˣ��Ķ��ȡ�������Ŀ�����ȥ����������==="
		+((NewsPaper)o).getContent());
	}
	
}

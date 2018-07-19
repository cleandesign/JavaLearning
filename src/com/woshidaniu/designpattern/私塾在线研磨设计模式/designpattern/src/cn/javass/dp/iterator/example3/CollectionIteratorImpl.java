package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.iterator.example3;

import java.util.*;
import java.util.Iterator;

/**
 * ����ʵ�ַ���Collection���ϵĵ����ӿڣ�Ϊ���ⲿͳһ���ʷ�ʽ
 */
public class CollectionIteratorImpl implements Iterator {
	/**
	 * ������ű������ľۺ϶���
	 */
	private PayManager aggregate = null;
	/**
	 * ������¼��ǰ��������λ������
	 * -1��ʾ�տ�ʼ��ʱ�򣬵�����ָ��ۺ϶����һ������֮ǰ
	 */
	private int index = -1;
	
	public CollectionIteratorImpl(PayManager aggregate){
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

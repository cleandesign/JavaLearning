package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example4;
import java.util.*;
/**
 * ����ṹ,ͨ���������Ԫ�ض�����б������÷������ܷ��ʵ����е�Ԫ��
 */
public class ObjectStructure {
	/**
	 * Ҫ�����Ŀͻ�����
	 */
	private Collection<Customer> col = new ArrayList<Customer>();
	/**
	 * �ṩ���ͻ��˲����ĸ߲�ӿڣ�����Ĺ����ɿͻ��˴���ķ����߾���
	 * @param visitor �ͻ�����Ҫʹ�õķ�����
	 */
	public void handleRequest(Visitor visitor){
		//ѭ������ṹ�е�Ԫ�أ����ܷ���
		for(Customer cm : col){
			cm.accept(visitor);
		}
	}
	/**
	 * �齨����ṹ�������ṹ�����Ԫ�ء�
	 * ��ͬ�Ķ���ṹ�в�ͬ�Ĺ�����ʽ
	 * @param ele ���뵽����ṹ��Ԫ��
	 */
	public void addElement(Customer ele){
		this.col.add(ele);
	}
}

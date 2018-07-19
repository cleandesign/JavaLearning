package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example3;
import java.util.*;
/**
 * ����ṹ,ͨ���������Ԫ�ض�����б������÷������ܷ��ʵ����е�Ԫ��
 */
public class ObjectStructure {
	/**
	 * ʾ�⣬��ʾ����ṹ��������һ����Ͻṹ���Ǽ���
	 */
	private Collection<Element> col = new ArrayList<Element>();
	/**
	 * ʾ�ⷽ�����ṩ���ͻ��˲����ĸ߲�ӿ�
	 * @param visitor �ͻ�����Ҫʹ�õķ�����
	 */
	public void handleRequest(Visitor visitor){
		//ѭ������ṹ�е�Ԫ�أ����ܷ���
		for(Element ele : col){
			ele.accept(visitor);
		}
	}
	/**
	 * ʾ�ⷽ�����齨����ṹ�������ṹ�����Ԫ�ء�
	 * ��ͬ�Ķ���ṹ�в�ͬ�Ĺ�����ʽ
	 * @param ele ���뵽����ṹ��Ԫ��
	 */
	public void addElement(Element ele){
		this.col.add(ele);
	}
}

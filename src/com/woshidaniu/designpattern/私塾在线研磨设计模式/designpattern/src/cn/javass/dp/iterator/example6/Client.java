package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.iterator.example6;

import java.util.Collection;
import java.util.Iterator;

public class Client {
	public static void main(String[] args) {
		//���ʼ��ŵĹ����б�
		PayManager payManager= new PayManager();
		//�ȼ����ٻ�ȡ
		payManager.calcPay();
		System.out.println("���Ź����б�");
		test(payManager.createIterator());
		//�������չ���˾�Ĺ����б�
		SalaryManager salaryManager = new SalaryManager();
		//�ȼ����ٻ�ȡ
		salaryManager.calcSalary();
		System.out.println("���չ��Ĺ�˾�����б�");
		test(salaryManager.createIterator());
	}
	/**
	 * ����ͨ�����ʾۺ϶���ĵ��������Ƿ����������ʾۺ϶���
	 * @param it �ۺ϶���ĵ�����
	 */
	private static void test(Iterator it){
		while(it.hasNext()){
			PayModel pm = (PayModel)it.next();
			System.out.println(pm);
		}
	}
}

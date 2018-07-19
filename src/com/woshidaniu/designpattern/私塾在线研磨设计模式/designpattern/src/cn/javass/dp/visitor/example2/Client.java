package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example2;

import java.util.ArrayList;
import java.util.Collection;

public class Client {
	public static void main(String[] args) {
		//׼�����������
		Collection<Customer> colCustomer = preparedTestData();
		//ѭ���Կͻ����в���
		for(Customer cm : colCustomer){
			//����ƫ�÷���
			cm.predilectionAnalyze();
			//���м�ֵ����
			cm.worthAnalyze();
		}
	}
	private static Collection<Customer> preparedTestData(){
		Collection<Customer> colCustomer = new ArrayList<Customer>();
		//Ϊ�˲��Է��㣬׼��������
		Customer cm1 = new EnterpriseCustomer();
		cm1.setName("ABC����");
		colCustomer.add(cm1);
		
		Customer cm2 = new EnterpriseCustomer();
		cm2.setName("CDE��˾");
		colCustomer.add(cm2);
		
		Customer cm3 = new PersonalCustomer();
		cm3.setName("����");
		colCustomer.add(cm3);
		
		return colCustomer;
	}
}
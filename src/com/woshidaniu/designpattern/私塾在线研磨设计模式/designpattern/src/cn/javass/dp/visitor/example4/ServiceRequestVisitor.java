package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example4;
/**
 * ����ķ����ߣ�ʵ�ֿͻ������������Ĺ���
 */
public class ServiceRequestVisitor implements Visitor {
	public void visitEnterpriseCustomer(EnterpriseCustomer ec){
		//��ҵ�ͻ�����ľ����������
		System.out.println(ec.getName()+"��ҵ�����������");
	}
	public void visitPersonalCustomer(PersonalCustomer pc){
		//���˿ͻ�����ľ����������
		System.out.println("�ͻ�"+pc.getName()+"�����������");
	}
}
package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example4;
/**
 * ����ķ����ߣ�ʵ�ֶԿͻ���ֵ����
 */
public class WorthAnalyzeVisitor implements Visitor {
	public void visitEnterpriseCustomer(EnterpriseCustomer ec){
		//���ݹ���Ľ���С������Ĳ�Ʒ�ͷ���Ķ��١������Ƶ�ʵȽ��з���
		//��ҵ�ͻ��ı�׼��ȸ��˿ͻ��ĸ�
		System.out.println("���ڶ���ҵ�ͻ�"+ec.getName()+"���м�ֵ����");
	}
	public void visitPersonalCustomer(PersonalCustomer pc){
		System.out.println("���ڶԸ��˿ͻ�"+pc.getName()+"���м�ֵ����");
	}
}
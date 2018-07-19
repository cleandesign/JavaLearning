package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example4;
/**
 * ����ķ����ߣ�ʵ�ֶԿͻ���ƫ�÷���
 */
public class PredilectionAnalyzeVisitor implements Visitor {
	public void visitEnterpriseCustomer(EnterpriseCustomer ec){
		//���ݹ����������ʷ��Ǳ�ڹ�������
		//�Լ��ͻ�������ҵ�ķ�չ���ơ��ͻ��ķ�չԤ�ڵȵķ���
		System.out.println("���ڶ���ҵ�ͻ�"+ec.getName()+"���в�Ʒƫ�÷���");
	}
	public void visitPersonalCustomer(PersonalCustomer pc){
		System.out.println("���ڶԸ��˿ͻ�"+pc.getName()+"���в�Ʒƫ�÷���");
	}
}
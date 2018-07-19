package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example4;

public class Client {
	public static void main(String[] args) {
		//����ObjectStruct
		ObjectStructure os = new ObjectStructure();
		//׼����������ݣ������ͻ����󣬲�����ObjectStructure
		Customer cm1 = new EnterpriseCustomer();
		cm1.setName("ABC����");
		os.addElement(cm1);
		
		Customer cm2 = new EnterpriseCustomer();
		cm2.setName("CDE��˾");
		os.addElement(cm2);
		
		Customer cm3 = new PersonalCustomer();
		cm3.setName("����");
		os.addElement(cm3);
		
		//�ͻ�����������󣬴�����������Visitor
		ServiceRequestVisitor srVisitor = new ServiceRequestVisitor();
		os.handleRequest(srVisitor);
		
		//Ҫ�Կͻ�����ƫ�÷���������ƫ�÷�����Visitor
		PredilectionAnalyzeVisitor paVisitor = new PredilectionAnalyzeVisitor();
		os.handleRequest(paVisitor);
		
		//Ҫ�Կͻ����м�ֵ�����������ֵ������Visitor
		WorthAnalyzeVisitor waVisitor = new WorthAnalyzeVisitor();
		os.handleRequest(waVisitor);
		
	}
}
package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example5;
/**
 * ����ķ����ߣ�ʵ�֣������������ƣ�����϶��������ǰ�����"�ڵ㣺"��
 * ��Ҷ�Ӷ��������ǰ�����"Ҷ�ӣ�"
*/
public class PrintNameVisitor implements Visitor {
	public void visitComposite(Composite composite) {
		//���ʵ���϶��������
		System.out.println("�ڵ㣺"+composite.getName());
	}
	public void visitLeaf(Leaf leaf) {
		//���ʵ�Ҷ�Ӷ��������		
		System.out.println("Ҷ�ӣ�"+leaf.getName());
	}
}

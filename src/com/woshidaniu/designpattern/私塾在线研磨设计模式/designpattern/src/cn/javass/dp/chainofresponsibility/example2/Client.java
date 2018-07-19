package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.chainofresponsibility.example2;
/**
 * ְ�����Ŀͻ��ˣ�����ֻ�Ǹ�ʾ��
 */
public class Client {
	public static void main(String[] args) {
		//��Ҫ��װְ����
		Handler h1 = new ConcreteHandler1();
		Handler h2 = new ConcreteHandler2();
		
		h1.setSuccessor(h2);		
		//Ȼ���ύ����
		h1.handleRequest();
	}
}

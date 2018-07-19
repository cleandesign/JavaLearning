package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.proxy.example2;
/**
 * �������
 */
public class Proxy implements Subject{
	/**
	 * ���б�����ľ����Ŀ�����
	 */
	private RealSubject realSubject=null;
	/**
	 * ���췽�������뱻����ľ����Ŀ�����
	 * @param realSubject ������ľ����Ŀ�����
	 */
	public Proxy(RealSubject realSubject){
		this.realSubject = realSubject;
	}
	
	public void request() {
		//��ת�������Ŀ�����ǰ������ִ��һЩ���ܴ���
		
		//ת�������Ŀ�����ķ���
		realSubject.request();
		
		//��ת�������Ŀ�����󣬿���ִ��һЩ���ܴ���
	}

}

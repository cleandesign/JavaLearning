package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.chainofresponsibility.example2;
/**
 * �����ְ�����������������
 */
public class ConcreteHandler1 extends Handler {
	public void handleRequest() {
		//����ĳЩ�������ж��Ƿ������Լ������ְ��Χ
		//�ж��������磺���ⲿ����Ĳ�����������������ȥ��ȡ���ⲿ���ݣ�
		//������ݿ��л�ȡ�ȣ�������仰ֻ�Ǹ�ʾ��
		boolean someCondition = false;
		
		if(someCondition){
			//��������Լ������ְ��Χ���������ﴦ������
			//����Ĵ������
			System.out.println("ConcreteHandler1 handle request");
		}else{
			//����������Լ������ְ��Χ���Ǿ��ж��Ƿ��к�̵�ְ�����
			//����У���ת���������̵�ְ�����
			//���û�У�ʲô����������Ȼ����
			if(this.successor!=null){
				this.successor.handleRequest();
			}
		}
	}
}


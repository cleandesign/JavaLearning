package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.memento.example3;

public class Client {
	public static void main(String[] args) {
		// ����ģ���������̵Ķ���
		FlowAMock mock = new FlowAMock("TestFlow");
		//�������̵ĵ�һ���׶�
		mock.runPhaseOne();
		
		//����һ��������
		FlowAMementoCareTaker careTaker = new FlowAMementoCareTaker();
		//������ʱ����ı���¼���󣬲����浽�����߶����������Ҫ��
		FlowAMockMemento memento = mock.createMemento();
		careTaker.saveMemento(memento);
		
		//���շ���һ���������̺�벿��
		mock.schema1();
		
		//�ӹ����߻�ȡ����¼����Ȼ�����û�ȥ��
		//��ģ���������̵Ķ����Լ��ָ��Լ����ڲ�״̬
		mock.setMemento(careTaker.retriveMemento());
		
		//���շ��������������̺�벿��
		mock.schema2();
	}
}

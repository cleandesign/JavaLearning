package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.memento.example1;

public class Client {
	public static void main(String[] args) {
		// ����ģ���������̵Ķ���
		FlowAMock mock = new FlowAMock("TestFlow");
		//�������̵ĵ�һ���׶�
		mock.runPhaseOne();
		//�õ���һ���׶����������������ݣ�����Ҫ��
		int tempResult = mock.getTempResult();
		String tempState = mock.getTempState();
		
		//���շ���һ���������̺�벿��
		mock.schema1();
		
		//�ѵ�һ���׶������������������������û�ȥ
		mock.setTempResult(tempResult);
		mock.setTempState(tempState);
		
		//���շ��������������̺�벿��
		mock.schema2();
	}
}

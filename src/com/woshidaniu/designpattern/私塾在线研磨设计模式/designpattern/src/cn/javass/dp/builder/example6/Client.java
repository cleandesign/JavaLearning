package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.builder.example6;

public class Client {
	public static void main(String[] args) {
		//����������
		InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("001",12345L,67890L);
		//������Ҫ�����ݣ�Ȼ�󹹽����պ�ͬ����
		InsuranceContract contract = builder.setPersonName("����").setOtherData("test").build();
		//�������պ�ͬ����ķ���
		contract.someOperation();
	}
}

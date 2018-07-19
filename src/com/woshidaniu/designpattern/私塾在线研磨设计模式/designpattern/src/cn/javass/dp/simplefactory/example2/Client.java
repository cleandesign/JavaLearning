package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.simplefactory.example2;
/**
 * �ͻ��ˣ�ʹ��Api�ӿ�
 */
public class Client {
	public static void main(String[] args) {
		//ͨ���򵥹�������ȡ�ӿڶ���
		Api api = Factory.createApi(1);
		api.operation("����ʹ�ü򵥹���");
	}
}

package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.simplefactory.example5;

/**
 * �ͻ��ˣ�����ʹ��Api�ӿ�
 */
public class Client {
	public static void main(String[] args) {
		//��Ҫ�ı䣬û��new Impl()�ˣ�ȡ����֮Factory.createApi()
		Api api = Factory.createApi();
		api.test1("��������Ҫ���ţ�ֻ�Ǹ����Զ��ѣ�");
	}
}

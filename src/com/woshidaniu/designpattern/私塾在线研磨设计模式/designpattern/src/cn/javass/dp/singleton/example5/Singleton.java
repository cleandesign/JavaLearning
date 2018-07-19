package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.singleton.example5;

public class Singleton {
	//4������һ���������洢�����õ���ʵ��
	//5����Ϊ�������Ҫ�ھ�̬������ʹ�ã�������Ҫ����static����
	private static Singleton instance = null;
	//1��˽�л����췽���������ڲ����ƴ���ʵ������Ŀ
	private Singleton(){
	}
	//2������һ��������Ϊ�ͻ����ṩ��ʵ��
	//3�����������Ҫ������෽����Ҳ����Ҫ��static
	public static  Singleton getInstance(){
		//6���жϴ洢ʵ���ı����Ƿ���ֵ
		if(instance == null){
			//6.1�����û�У��ʹ���һ����ʵ��������ֵ��ֵ���洢��ʵ���ı���
			instance = new Singleton();
		}
		//6.2�������ֵ���Ǿ�ֱ��ʹ��
		return instance;
	}
}

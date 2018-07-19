package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.singleton.example6;

public class Singleton {
	//4������һ����̬�������洢�����õ���ʵ��
	//ֱ�������ﴴ����ʵ����ֻ�ᴴ��һ��
	private static Singleton instance = new Singleton();
	//1��˽�л����췽���������ڲ����ƴ���ʵ������Ŀ
	private Singleton(){		
	}
	//2������һ��������Ϊ�ͻ����ṩ��ʵ��
	//3�����������Ҫ������෽����Ҳ����Ҫ��static
	public static Singleton getInstance(){
		//5��ֱ��ʹ���Ѿ������õ�ʵ��
		return instance;
	}
}

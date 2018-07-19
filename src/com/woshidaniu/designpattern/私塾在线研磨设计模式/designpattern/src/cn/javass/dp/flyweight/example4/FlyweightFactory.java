package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.flyweight.example4;

import java.util.*;
/**
 * ��Ԫ������ͨ��ʵ�ֳ�Ϊ����
 */
public class FlyweightFactory {
	private static FlyweightFactory factory = new FlyweightFactory();
	private FlyweightFactory(){
		
	}
	public static FlyweightFactory getInstance(){
		return factory;
	}
	/**
	 * ������flyweight����
	 */
	private Map<String,Flyweight> fsMap = new HashMap<String,Flyweight>();
	/**
	 * ��ȡkey��Ӧ����Ԫ����
	 * @param key ��ȡ��Ԫ�����key
	 * @return key��Ӧ����Ԫ����
	 */
	public Flyweight getFlyweight(String key) {
		Flyweight f = fsMap.get(key);
		//��һ�����򵥵��д��
		if(f==null){
			f = new AuthorizationFlyweight(key);
			fsMap.put(key,f);
		}
		return f;
	}
}

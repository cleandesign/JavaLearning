package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.singleton.example9;
import java.util.*;
/**
 * ����ʾ�����չ����ģʽ������ʵ����ĿΪ3�� 
 */
public class OneExtend {
	/**
	 * ����һ��ȱʡ��keyֵ��ǰ׺
	 */
	private final static String DEFAULT_PREKEY = "Cache";
	/**
	 * ����ʵ��������
	 */
	private static Map<String,OneExtend> map = new HashMap<String,OneExtend>();
	/**
	 * ������¼��ǰ����ʹ�õڼ���ʵ�������˿��Ƶ������Ŀ���ͷ��ش�1��ʼ
	 */
	private static int num = 1;
	/**
	 * �������ʵ���������Ŀ
	 */
	private final static int NUM_MAX = 3; 
	private OneExtend(){}
	public static OneExtend getInstance(){
		String key = DEFAULT_PREKEY+num;
		OneExtend oneExtend = map.get(key);
		if(oneExtend==null){
			oneExtend = new OneExtend();
			map.put(key, oneExtend);
		}
		//�ѵ�ǰʵ������ż�1
		num++;
		if(num > NUM_MAX){
			//���ʵ��������Ѿ��ﵽ�����Ŀ�ˣ��Ǿ��ظ���1��ʼ��ȡ
			num = 1;
		}
		return oneExtend;		
	}
	
	public static void main(String[] args) {
		OneExtend t1 = getInstance();
		OneExtend t2 = getInstance();
		OneExtend t3 = getInstance();
		OneExtend t4 = getInstance();
		OneExtend t5 = getInstance();
		OneExtend t6 = getInstance();
		
		System.out.println("t1=="+t1);
		System.out.println("t2=="+t2);
		System.out.println("t3=="+t3);
		System.out.println("t4=="+t4);
		System.out.println("t5=="+t5);
		System.out.println("t6=="+t6);
	}
}

package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.flyweight.example3;
import java.util.*;
/**
 * �������ã����ڴ���ģ�����ݿ��е�ֵ
 */
public class TestDB {
	/**
	 * ���������Ȩ���ݵ�ֵ
	 */
	public static Collection<String> colDB = new ArrayList<String>();
	
	static{
		//ͨ����̬�������ģ�������		
		colDB.add("����,��Ա�б�,�鿴");
		colDB.add("����,��Ա�б�,�鿴");
		colDB.add("����,н������,�鿴");
		colDB.add("����,н������,�޸�");
		//���Ӹ������Ȩ����
		for(int i=0;i<3;i++){
			colDB.add("����"+i+",��Ա�б�,�鿴");
		}
	}	
}

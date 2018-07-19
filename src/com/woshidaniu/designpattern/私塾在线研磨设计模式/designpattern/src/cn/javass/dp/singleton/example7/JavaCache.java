package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.singleton.example7;
import java.util.*;
/**
 * Java�л���Ļ���ʵ��ʾ��
 */
public class JavaCache {
	/**
	 * �������ݵ������������Map�Ƿ�����ʣ�ֱ�Ӹ���Key�Ϳ��Ի�ȡValue��
	 * keyѡ��String��Ϊ�˼򵥣�������ʾ
	 */
	private Map<String,Object> map = new HashMap<String,Object>();
	/**
	 * �ӻ����л�ȡֵ
	 * @param key ����ʱ���keyֵ
	 * @return key��Ӧ��Valueֵ
	 */
	public Object getValue(String key){
		//�ȴӻ�������ȡֵ
		Object obj = map.get(key);
		//�жϻ��������Ƿ���ֵ
		if(obj == null){
			//���û�У���ô��ȥ��ȡ��Ӧ�����ݣ������ȡ���ݿ�����ļ�
			//����ֻ����ʾ������ֱ��д���ٵ�ֵ
			obj = key+",value";
			//�ѻ�ȡ��ֵ���ûص���������
			map.put(key, obj);
		}
		//�����ֵ�ˣ���ֱ�ӷ���ʹ��
		return obj;
	}
}

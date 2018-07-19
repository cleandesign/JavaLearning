package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.iterator.example8;
import java.util.*;
/**
 * ���巭ҳ���ʾۺ�Ԫ�صĵ����ӿ�
 */
public interface AggregationIterator {
	/**
	 * �ж��Ƿ�����һ��Ԫ�أ�����ν�Ƿ�һҳ�����ݣ�
	 * ��Ϊ�������ֻ��һ�����ݣ�Ҳ��Ҫ��һҳ��
	 * @return �������һ��Ԫ�أ�����true��û����һ��Ԫ�ؾͷ���false
	 */
	public boolean hasNext();
	/**
	 * ȡ�����漸��Ԫ��
	 * @param num ��Ҫ��ȡ�ļ�¼����
	 * @return ���漸��Ԫ��
	 */
	public Collection next(int num);
	/**
	 * �ж��Ƿ�����һ��Ԫ�أ�����ν�Ƿ�һҳ�����ݣ�
	 * ��Ϊ�������ֻ��һ�����ݣ�Ҳ��Ҫ��һҳ��
	 * @return �������һ��Ԫ�أ�����true��û����һ��Ԫ�ؾͷ���false
	 */
	public boolean hasPrevious();
	/**
	 * ȡ�����漸��Ԫ��
	 * @param num ��Ҫ��ȡ�ļ�¼����
	 * @return ���漸��Ԫ��
	 */
	public Collection previous(int num);
}

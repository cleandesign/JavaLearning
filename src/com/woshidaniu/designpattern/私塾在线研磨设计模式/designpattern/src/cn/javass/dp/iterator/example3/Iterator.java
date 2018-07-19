package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.iterator.example3;

/**
 * �������ӿڣ�������ʺͱ���Ԫ�صĲ���
 */
public interface Iterator {
	/**
	 * �ƶ����ۺ϶���ĵ�һ��λ��
	 */
	public void first();
	/**
	 * �ƶ����ۺ϶������һ��λ��
	 */
	public void next();
	/**
	 * �ж��Ƿ��Ѿ��ƶ��ۺ϶�������һ��λ��
	 * @return true��ʾ�Ѿ��ƶ��ۺ϶�������һ��λ�ã�
	 *         false��ʾ��û���ƶ����ۺ϶�������һ��λ��
	 */
	public boolean isDone();
	/**
	 * ��ȡ�����ĵ�ǰԪ��
	 * @return �����ĵ�ǰԪ��
	 */
	public Object currentItem();
}


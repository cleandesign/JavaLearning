package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.state.example2;


/**
 * ��װ��Context��һ���ض�״̬��ص���Ϊ
 */
public interface State {
	/**
	 * ״̬��Ӧ�Ĵ���
	 * @param sampleParameter ʾ��������˵�����Դ�����������崫��
	 *             ʲô���Ĳ��������뼸���������ɾ���Ӧ�����������
	 */
	public void handle(String sampleParameter);
}
package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.mediator.example1;
/**
 * �н��ߣ��������ͬ�¶���ͨ�ŵĽӿ�
 */
public interface Mediator {
	/**
	 * ͬ�¶���������ı��ʱ����֪ͨ�н��ߵķ�����
	 * ���н���ȥ������Ӧ��������ͬ�¶���Ľ���
	 * @param colleague ͬ�¶������������н��߶���ͨ������ʵ��
	 *                  ȥ��ȡͬ�¶����״̬
	 */
	public void changed(Colleague colleague);
}
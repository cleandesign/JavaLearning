package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.memento.example4;
/**
 * ����һ������Ľӿ�
 */
public interface Command {
	/**
	 * ִ������
	 */
	public void execute();
	/**
	 * ��������ָ�������¼�����¼��״̬
	 * @param m ����¼����
	 */
	public void undo(Memento m);
	/**
	 * ��������ָ�������¼�����¼��״̬
	 * @param m ����¼����
	 */
	public void redo(Memento m);
	/**
	 * ��������ԭ���������״̬�ı���¼����
	 * @return �����õı���¼����
	 */
	public Memento createMemento();
}

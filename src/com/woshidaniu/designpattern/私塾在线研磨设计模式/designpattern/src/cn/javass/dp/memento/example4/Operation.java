package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.memento.example4;
/**
 * �����࣬����ʵ�ּӼ�������
 */
public class Operation implements OperationApi{
	/**
	 * ��¼����Ľ��
	 */
	private int result;
	public int getResult() {
		return result;
	}

	public void add(int num){
		result += num;
	}
	public void substract(int num){
		result -= num;
	}
	public Memento createMemento() {
		MementoImpl m = new MementoImpl(result);
		return m;
	}
	public void setMemento(Memento memento) {
		MementoImpl m = (MementoImpl)memento;
		this.result = m.getResult();
	}
	/**
	 * ����¼����
	 */
	private static class MementoImpl implements Memento{
		private int result = 0;
		public MementoImpl(int result){
			this.result = result;
		}

		public int getResult() {
			return result;
		}
	}
}

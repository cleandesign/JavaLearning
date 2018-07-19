package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.memento.example4;
/**
 * �������Ĺ�������ʵ�ָ����������Ĺ�������
 */
public abstract class AbstractCommand implements Command{
	/**
	 * ����Ĺ���ʵ�֣����ﲻ��
	 */
	public abstract void execute();
	/**
	 * ��������������ʵ���߶���
	 */
	protected OperationApi operation = null;
	public void setOperation(OperationApi operation) {
		this.operation = operation;
	}
	
	public Memento createMemento() {
		return this.operation.createMemento();
	}

	public void redo(Memento m) {
		this.operation.setMemento(m);
	}

	public void undo(Memento m) {
		this.operation.setMemento(m);
	}
}

package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.memento.example2;
import java.util.*;
/**
 * ���𱣴汸��¼�Ķ���
 */
public class Caretaker{
	/**
	 * ��¼������ı���¼����
	 */
	private Memento memento = null;
	/**
	 * ���汸��¼����
	 * @param memento ������ı���¼����
	 */
	public void saveMemento(Memento memento){
		this.memento = memento;
	}
	/**
	 * ��ȡ������ı���¼����
	 * @return ������ı���¼����
	 */
	public Memento retriveMemento(){
		return this.memento;
	}
}


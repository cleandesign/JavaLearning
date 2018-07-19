package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.observer.example2;
import java.util.*;
/**
 * ��ֽ���󣬾����Ŀ��ʵ��
 */
public class NewsPaper extends Subject{
	/**
	 * ��ֽ�ľ�������
	 */
	private String content;
	/**
	 * ��ȡ��ֽ�ľ�������
	 * @return ��ֽ�ľ�������
	 */
	public String getContent() {
		return content;
	}
	/**
	 * ʾ�⣬���ñ�ֽ�ľ������ݣ��൱��Ҫ���汨ֽ��
	 * @param content ��ֽ�ľ�������
	 */
	public void setContent(String content) {
		this.content = content;
		//�������ˣ�˵���ֳ���ֽ�ˣ��Ǿ�֪ͨ���еĶ���
		notifyObservers();
	}
}

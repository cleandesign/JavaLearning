package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.observer.example5;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ˮ�ʼ���Ŀ�����
 */
public abstract class WaterQualitySubject {
	/**
	 * ��������ע��Ĺ۲��߶���
	 */
	protected List<WatcherObserver> observers = new ArrayList<WatcherObserver>();
	/**
	 * ע��۲��߶���
	 * @param observer �۲��߶���
	 */
	public void attach(WatcherObserver observer) {
		observers.add(observer);
	}
	/**
	 * ɾ���۲��߶���
	 * @param observer �۲��߶���
	 */
	public void detach(WatcherObserver observer) {
		observers.remove(observer);
	}
	/**
	 * ֪ͨ��Ӧ�Ĺ۲��߶���
	 */
	public abstract void notifyWatchers();
	/**
	 * ��ȡˮ����Ⱦ�ļ���
	 * @return ˮ����Ⱦ�ļ���
	 */
	public abstract int getPolluteLevel();
}

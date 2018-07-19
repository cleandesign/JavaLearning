package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.observer.example5;
/**
 * ����Ĺ۲���ʵ��
 */
public class Watcher implements WatcherObserver{
	/**
	 * ְ��
	 */
	private String job;
	
	public void update(WaterQualitySubject subject) {
		//������õ������ķ�ʽ
		System.out.println(job+"��ȡ��֪ͨ����ǰ��Ⱦ����Ϊ��"+subject.getPolluteLevel());
	}
	
	public String getJob() {
		return this.job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
}

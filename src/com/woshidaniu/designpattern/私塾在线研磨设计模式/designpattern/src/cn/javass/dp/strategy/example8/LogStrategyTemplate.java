package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.strategy.example8;
import java.text.*;
/**
 * ʵ����־���Եĳ���ģ�壬ʵ�ָ���Ϣ���ʱ��
 */
public abstract class LogStrategyTemplate implements LogStrategy{
	
	public final void log(String msg) {
		//��һ��������Ϣ��Ӽ�¼��־��ʱ��
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		msg = df.format(new java.util.Date())+" �����ǣ�"+ msg;
		//�ڶ���������ִ����־��¼
		doLog(msg);
	}
	/**
	 * ����ִ����־��¼��������ȥ����ʵ��
	 * @param msg ���¼����־��Ϣ
	 */
	protected abstract void doLog(String msg);
}
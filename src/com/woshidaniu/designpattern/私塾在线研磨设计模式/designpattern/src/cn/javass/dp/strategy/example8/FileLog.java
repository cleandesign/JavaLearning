package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.strategy.example8;
/**
 * ����־��¼�����ݿ�
 */
public class FileLog extends LogStrategyTemplate{
	public void doLog(String msg) {
		System.out.println("���ڰ� '"+msg+"' ��¼���ļ���");
	}
}

package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.strategy.example6;
/**
 * ����־��¼���ļ�
 */
public class FileLog implements LogStrategy{
	public void log(String msg) {
		System.out.println("���ڰ� '"+msg+"' ��¼���ļ���");
	}
}

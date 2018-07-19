package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.factorymethod.example3;
/**
 * ���������ݿⱸ���ļ���ʽ�Ķ���
 */
public class ExportDB implements ExportFileApi{
	public boolean export(String data) {
		//��ʾ��һ�£�������Ҫ�������ݿ���ļ�
		System.out.println("��������"+data+"�����ݿⱸ���ļ�");
		return true;
	}
}

package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.factorymethod.example3;
/**
 * ����Ĵ�����ʵ�ֶ���ʵ�ִ������������ݿⱸ���ļ���ʽ�Ķ���
 */
public class ExportDBOperate extends ExportOperate{
	protected ExportFileApi factoryMethod() {
		//�������������ݿⱸ���ļ���ʽ�Ķ���
		return new ExportDB();
	}
}

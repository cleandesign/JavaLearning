package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.factorymethod.example7;
/**
 * ������xml�ļ��Ķ���
 */
public class ExportXml implements ExportFileApi{
	public boolean export(String data) {
		//��ʾ��һ��
		System.out.println("��������"+data+"��XML�ļ�");
		return true;
	}
}

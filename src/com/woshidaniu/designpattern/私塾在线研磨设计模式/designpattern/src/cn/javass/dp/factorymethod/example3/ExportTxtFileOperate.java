package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.factorymethod.example3;
/**
 * ����Ĵ�����ʵ�ֶ���ʵ�ִ����������ı��ļ���ʽ�Ķ���
 */
public class ExportTxtFileOperate extends ExportOperate{

	protected ExportFileApi factoryMethod() {
		//�����������ı��ļ���ʽ�Ķ���
		return new ExportTxtFile();
	}

}

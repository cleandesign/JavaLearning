package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.facade.example3;
/**
 * ʾ�����ɱ��ֲ��ģ��
 */
public class Presentation {
	public void generate(){
		//1�������ù��������ȡ��Ӧ��������Ϣ
		ConfigModel cm = ConfigManager.getInstance().getConfigData();
		if(cm.isNeedGenPresentation()){
			//2������Ҫ��ȥ������Ӧ�Ĵ��룬��������ļ�
			System.out.println("�������ɱ��ֲ�����ļ�");
		}
	}
}
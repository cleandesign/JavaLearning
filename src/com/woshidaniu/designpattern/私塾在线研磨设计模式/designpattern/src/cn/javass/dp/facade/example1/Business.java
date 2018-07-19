package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.facade.example1;
/**
 * ʾ�������߼����ģ��
 */
public class Business {
	public void generate(){
		//1�������ù��������ȡ��Ӧ��������Ϣ
		ConfigModel cm = ConfigManager.getInstance().getConfigData();
		if(cm.isNeedGenBusiness()){
			//2������Ҫ��ȥ������Ӧ�Ĵ��룬��������ļ�
			System.out.println("���������߼�������ļ�");
		}
	}
}
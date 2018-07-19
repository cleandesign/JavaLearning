package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.facade.example1;
/**
 * ʾ���������ݲ��ģ��
 */
public class DAO {
	public void generate(){
		//1�������ù��������ȡ��Ӧ��������Ϣ
		ConfigModel cm = ConfigManager.getInstance().getConfigData();
		if(cm.isNeedGenDAO()){
			//2������Ҫ��ȥ������Ӧ�Ĵ��룬��������ļ�
			System.out.println("�����������ݲ�����ļ�");
		}
	}
}
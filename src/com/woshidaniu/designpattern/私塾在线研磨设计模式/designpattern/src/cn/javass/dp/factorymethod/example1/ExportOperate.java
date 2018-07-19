package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.factorymethod.example1;
/**
 * ʵ�ֵ������ݵ�ҵ���ܶ���
 */
public class ExportOperate {
	/**
	 * �����ļ�
	 * @param type �û�ѡ��ĵ�������
	 * @param data ��Ҫ���������
	 * @return �Ƿ�ɹ������ļ�
	 */
	public boolean export(int type,String data){
		ExportFileApi api = null;
		//����������ѡ�񾿾�Ҫ������һ�ֵ����ļ�����
		if(type == 1){
			api = new ExportTxtFile();
		}else if(type == 2){
			api = new ExportDB();
		}
		return api.export(data);
	}
}

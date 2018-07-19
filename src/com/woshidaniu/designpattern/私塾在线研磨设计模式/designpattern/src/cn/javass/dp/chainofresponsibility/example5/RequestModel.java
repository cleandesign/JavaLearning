package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.chainofresponsibility.example5;
/**
 * ͨ�õ��������
 */
public class RequestModel {
	/**
	 * ��ʾ�����ҵ������
	 */
	private String type;
	/**
	 * ͨ�����췽���Ѿ����ҵ�����ʹ��ݽ���
	 * @param type �����ҵ������
	 */
	public RequestModel(String type){
		this.type = type;
	}
	public String getType() {
		return type;
	}	
}
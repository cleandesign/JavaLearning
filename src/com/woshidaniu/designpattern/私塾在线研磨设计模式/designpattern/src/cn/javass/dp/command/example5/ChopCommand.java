package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example5;
/**
 * ��������̶��Ź���
 */
public class ChopCommand implements Command{
	/**
	 * ���о������˵ĳ�ʦ�Ķ���
	 */
	private CookApi cookApi = null;
	/**
	 * ���þ������˵ĳ�ʦ�Ķ���
	 * @param cookApi �������˵ĳ�ʦ�Ķ���
	 */
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}
	
	public void execute() {
		this.cookApi.cook("�̶��Ź���");
	}
}

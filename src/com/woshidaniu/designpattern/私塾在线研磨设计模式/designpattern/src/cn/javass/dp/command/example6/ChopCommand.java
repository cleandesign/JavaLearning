package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example6;


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
	/**
	 * ��˵�����
	 */
	private int tableNum;
	/**
	 * ���췽���������˵�����
	 * @param tableNum ��˵�����
	 */
	public ChopCommand(int tableNum){
		this.tableNum = tableNum;
	}
	public int getTableNum(){
		return this.tableNum;
	}
	
	public void execute() {
		this.cookApi.cook(tableNum,"�̶��Ź���");
	}
}

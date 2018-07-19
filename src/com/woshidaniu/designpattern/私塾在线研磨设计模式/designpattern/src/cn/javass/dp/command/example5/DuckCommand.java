package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example5;
/**
 * ������󣬱�����Ѽ
 */
public class DuckCommand implements Command{
	private CookApi cookApi = null;
	public void setCookApi(CookApi cookApi) {
		this.cookApi = cookApi;
	}
	
	public void execute() {
		this.cookApi.cook("������Ѽ");
	}
}

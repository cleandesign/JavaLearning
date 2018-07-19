package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.facade.example3;
/**
 * ����������ϵͳ����۶���
 */
public class Facade {
	/**
	 * �ͻ�����Ҫ�ģ�һ���򵥵ĵ��ô������ɵĹ���
	 */
	public void generate(){
		new Presentation().generate();
		new Business().generate();
		new DAO().generate();
	}
}

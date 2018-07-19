package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.facade.example1;

public class Client {
	public static void main(String[] args) {
		//����û�������ļ�����ֱ��ʹ��Ĭ�ϵ�����
		//ͨ������£����㶼Ӧ�����ɣ�Ҳ����˵�ͻ��˱���
		//����Щģ�鶼���˽⣬���ܹ���ȷʹ������
		new Presentation().generate();
		new Business().generate();
		new DAO().generate();
	}
}
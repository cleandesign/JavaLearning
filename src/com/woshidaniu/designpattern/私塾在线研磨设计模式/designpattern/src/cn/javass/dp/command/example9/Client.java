package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example9;

public class Client {
	public static void main(String[] args) {
		//׼��Ҫ���������û�о���ʵ������
		Command cmd = new Command(){
			private String str = "";
			public void setStr(String s){
				str = s;
			}
			
			public void execute() {
				System.out.println("��ӡ������Ϊ="+str);
			}
		};
		cmd.setStr("�˻�������ģʽ������Java�ص���ʾ��");
		
		//���ʱ���Invoker����ó�Ϊ������
		Invoker invoker = new Invoker();
		//���°�ť����������ִ������
		invoker.startPrint(cmd);
	}
}
package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.command.example9;

public class Invoker {
	public void startPrint(Command cmd){	
		System.out.println("��Invoker�У��������ǰ");
		cmd.execute();
		System.out.println("����������");
	}
}
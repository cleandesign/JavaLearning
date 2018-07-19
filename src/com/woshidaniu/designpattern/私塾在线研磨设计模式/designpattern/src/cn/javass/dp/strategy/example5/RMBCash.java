package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.strategy.example5;
/**
 * ������ֽ�֧��
 */
public class RMBCash implements PaymentStrategy{
	
	public void pay(PaymentContext ctx) {
		System.out.println("���ڸ�"+ctx.getUserName()+"������ֽ�֧��"+ctx.getMoney()+"Ԫ");
	}

}

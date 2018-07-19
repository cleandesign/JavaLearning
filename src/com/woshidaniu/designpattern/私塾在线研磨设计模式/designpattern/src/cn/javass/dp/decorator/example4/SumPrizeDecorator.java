package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.decorator.example4;

import java.util.Date;
/**
 * װ�������󣬼����ۼƽ���
 */
public class SumPrizeDecorator extends Decorator{
	public SumPrizeDecorator(Component c){
		super(c);
	}
	
	public double calcPrize(String user, Date begin, Date end) {
		//1���Ȼ�ȡǰ����������Ľ���
		double money = super.calcPrize(user, begin, end);
		//2��Ȼ������ۼƽ���,��ʵ����Ӧ�ð�����Աȥ��ȡ�ۼƵ�ҵ��Ȼ���ٳ���0.1%
		//����ʾһ�£��ٶ���ҵ��ۼ�ҵ����1000000Ԫ
		double prize = 1000000 * 0.001;
		System.out.println(user+"�ۼƽ���"+prize);
		return money + prize;
	}

}

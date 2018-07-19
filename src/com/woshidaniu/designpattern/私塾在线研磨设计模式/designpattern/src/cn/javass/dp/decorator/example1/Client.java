package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.decorator.example1;

public class Client {
	public static void main(String[] args) {
		//�ȴ������㽱��Ķ���
		Prize p = new Prize();
		
		//���ڶ���û�����ϣ����Դ�null�Ϳ�����
		double zs = p.calcPrize("����",null,null);		
		System.out.println("==========����Ӧ�ý���"+zs);
		double ls = p.calcPrize("����",null,null);
		System.out.println("==========����Ӧ�ý���"+ls);		
		double ww = p.calcPrize("����",null,null);
		System.out.println("==========������Ӧ�ý���"+ww);
	}
}

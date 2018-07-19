package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.composite.example4;

public class RecursiveTest {
	/**
	 * ʾ��ݹ��㷨����׳ˡ�����ֻ�Ǽ򵥵�ʵ�֣�ֻ��ʵ������ֵ��С�Ľ׳ˣ�
	 * �������ݱȽϴ�Ľ׳ˣ�������100�Ľ׳�Ӧ�ò���java.math.BigDecimal
	 * ����java.math.BigInteger
	 * @param a ��׳˵���ֵ
	 * @return ����ֵ�Ľ׳�ֵ
	 */
	public int recursive(int a){
		if(a==1){
			return 1;
		}		
		return a * recursive(a-1);
	}
	
	public static void main(String[] args) {
		RecursiveTest test = new RecursiveTest();
		int result = test.recursive(5);
		System.out.println("5�Ľ׳�="+result);
	}
}

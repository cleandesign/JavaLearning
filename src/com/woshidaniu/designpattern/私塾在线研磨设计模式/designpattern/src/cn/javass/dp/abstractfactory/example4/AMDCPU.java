package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.abstractfactory.example4;
/**
 * AMD��CPUʵ��
 */
public class AMDCPU implements CPUApi{
	/**
	 * CPU�������Ŀ
	 */
	private int pins = 0;
	/**
	 * ���췽��������CPU�������Ŀ
	 * @param pins CPU�������Ŀ
	 */
	public AMDCPU(int pins){
		this.pins = pins;
	}
	public void calculate() {
		System.out.println("now in AMD CPU,pins="+pins);
	}
}

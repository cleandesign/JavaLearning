package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.abstractfactory.example3;

/**
 * װ����������AMD��CPU + ΢�ǵ�����
 * ���ﴴ��CPU����������ʱ���Ƕ�Ӧ�ģ���ƥ���ϵ�
 */
public class Schema2 implements AbstractFactory{
	public CPUApi createCPUApi() {
		return new AMDCPU(939);
	}
	public MainboardApi createMainboardApi() {
		return new MSIMainboard(939);
	}	
}
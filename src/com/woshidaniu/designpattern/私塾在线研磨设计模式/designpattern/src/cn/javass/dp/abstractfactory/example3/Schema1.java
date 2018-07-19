package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.abstractfactory.example3;

/**
 * װ������һ��Intel ��CPU + ���ε�����
 * ���ﴴ��CPU����������ʱ���Ƕ�Ӧ�ģ���ƥ���ϵ�
 */
public class Schema1 implements AbstractFactory{
	public CPUApi createCPUApi() {
		return new IntelCPU(1156);
	}
	public MainboardApi createMainboardApi() {
		return new GAMainboard(1156);
	}	
}
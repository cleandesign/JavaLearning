package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.abstractfactory.example1;
/**
 * ����CPU�ļ򵥹���
 */
public class CPUFactory {
	/**
	 * ����CPU�ӿڶ���ķ���
	 * @param type ѡ��CPU���͵Ĳ���
	 * @return CPU�ӿڶ���ķ���
	 */
	public static CPUApi createCPUApi(int type){
		CPUApi cpu = null;
		//���ݲ�����ѡ�񲢴�����Ӧ��CPU����
		if(type==1){
			cpu = new IntelCPU(1156);
		}else if(type==2){
			cpu = new AMDCPU(939);
		}
		return cpu;
	}	
}

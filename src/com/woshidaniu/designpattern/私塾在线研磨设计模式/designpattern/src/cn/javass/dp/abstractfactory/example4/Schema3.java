package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.abstractfactory.example4;

/**
 * װ����������Intel ��CPU + ���ε����� + �ִ����ڴ�
 */
public class Schema3 implements AbstractFactory{
	public Object createProduct(int type) {
		Object retObj = null;
		//typeΪ1��ʾ����CPU��typeΪ2��ʾ�������壬typeΪ3��ʾ�����ڴ�
		if(type==1){
			retObj = new IntelCPU(1156);
		}else if(type==2){
			retObj = new GAMainboard(1156);
		}
		//��������ӵĲ�Ʒ
		else if(type==3){
			retObj = new HyMemory();
		}
		return retObj;
	}
}

package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.iterator.example3;


/**
 * ���ͻ����չ����Ǹ���˾�Ĺ��ʹ�����
 */
public class SalaryManager extends Aggregate{
	/**
	 * ���������
	 */
	private PayModel[] pms = null;
	/**
	 * ��ȡ�����б�
	 * @return �����б�
	 */
	public PayModel[] getPays(){
		return pms;
	}
	/**
	 * ���㹤�ʣ���ʵӦ���кܶ������Ϊ����ʾ�Ӽ�
	 */
	public void calcSalary(){
		//���㹤�ʣ����ѹ�����Ϣ��䵽�����б�����
		//Ϊ�˲��ԣ���������ݽ�ȥ
		PayModel pm1 = new PayModel();
		pm1.setPay(2200);
		pm1.setUserName("����");
		
		PayModel pm2 = new PayModel();
		pm2.setPay(3600);
		pm2.setUserName("����");
		
		pms = new PayModel[2];
		pms[0] = pm1;
		pms[1] = pm2;
	}
	
	public Iterator createIterator(){
		return new ArrayIteratorImpl(this);
	}
	public Object get(int index){
		Object retObj = null;
		if(index < pms.length){
			retObj = pms[index];
		}
		return retObj;
	}
	public int size(){
		return this.pms.length;
	}
}

package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example2;
/**
 * ���˿ͻ�
 */
public class PersonalCustomer extends Customer{
	/**
	 * ��ϵ�绰
	 */
	private String telephone;
	/**
	 * ����
	 */
	private int age;
	
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	/**
	 * ���˿ͻ������������ķ�����ʾ��һ��
	 */
	public void serviceRequest(){
		//���˿ͻ�����ľ����������
		System.out.println("�ͻ�"+this.getName()+"�����������");
	}
	/**
	 * ���˿ͻ��Թ�˾��Ʒ��ƫ�÷�����ʾ��һ��
	 */
	public void predilectionAnalyze(){
		System.out.println("���ڶԸ��˿ͻ�"+this.getName()+"���в�Ʒƫ�÷���");
	}
	/**
	 * ���˿ͻ���ֵ������ʾ��һ��
	 */
	public void worthAnalyze(){
		System.out.println("���ڶԸ��˿ͻ�"+this.getName()+"���м�ֵ����");
	}
}
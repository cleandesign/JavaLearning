package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example4;


/**
 * ��ҵ�ͻ�
 */
public class EnterpriseCustomer extends Customer{
	/**
	 * ��ϵ��
	 */
	private String linkman;
	/**
	 * ��ϵ�绰
	 */
	private String linkTelephone;
	/**
	 * ��ҵע���ַ
	 */
	private String registerAddress;
	
	
	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getLinkTelephone() {
		return linkTelephone;
	}

	public void setLinkTelephone(String linkTelephone) {
		this.linkTelephone = linkTelephone;
	}

	public String getRegisterAddress() {
		return registerAddress;
	}

	public void setRegisterAddress(String registerAddress) {
		this.registerAddress = registerAddress;
	}
	
	public void accept(Visitor visitor) {
		//�ص������߶������Ӧ����
		visitor.visitEnterpriseCustomer(this);
	}
}

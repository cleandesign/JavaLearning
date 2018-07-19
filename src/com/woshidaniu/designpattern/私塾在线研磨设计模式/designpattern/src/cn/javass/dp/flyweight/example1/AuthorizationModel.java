package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.flyweight.example1;
/**
 * ������Ȩ���ݵ�����model
 */
public class AuthorizationModel {
	/**
	 * ��Ա
	 */
	private String user;
	/**
	 * ��ȫʵ��
	 */
	private String securityEntity;
	/**
	 * Ȩ��
	 */
	private String permit;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSecurityEntity() {
		return securityEntity;
	}
	public void setSecurityEntity(String securityEntity) {
		this.securityEntity = securityEntity;
	}
	public String getPermit() {
		return permit;
	}
	public void setPermit(String permit) {
		this.permit = permit;
	}
	
}

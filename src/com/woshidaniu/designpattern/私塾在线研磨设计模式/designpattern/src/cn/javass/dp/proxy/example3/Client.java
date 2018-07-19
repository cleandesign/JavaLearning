package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.proxy.example3;
import java.util.*;
public class Client {
	public static void main(String[] args) throws Exception{
		UserManager userManager = new UserManager();
		Collection<UserModelApi> col = userManager.getUserByDepId("0101");

		//���ֻ����ʾ�û����ƣ���ô����Ҫ���²�ѯ���ݿ�
		for(UserModelApi umApi : col){
			System.out.println("�û���ţ�="+umApi.getUserId()+",�û�������="+umApi.getName());
		}
		//������ʷ��û���ź��û�����������ԣ��Ǿͻ����²�ѯ���ݿ�
		for(UserModelApi umApi : col){
			System.out.println("�û���ţ�="+umApi.getUserId()+",�û�������="+umApi.getName()+",�������ţ�="+umApi.getDepId());
		}
	}
}
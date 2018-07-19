package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.templatemethod.example4;
/**
 * ������Ա��¼���Ƶ��߼�����
 */
public class WorkerLogin extends LoginTemplate{

	public LoginModel findLoginUser(String loginId) {
		// ����ʡ�Ծ���Ĵ�������ʾ�⣬����һ����Ĭ�����ݵĶ���
		LoginModel lm = new LoginModel();
		lm.setLoginId(loginId);
		lm.setPwd("workerpwd");
		return lm;
	}
	public String encryptPwd(String pwd){
		//���Ǹ���ķ������ṩ�����ļ���ʵ��
		//�����������м��ܣ�����ʹ�ã�MD5��3DES�ȵȣ�ʡ����
		System.out.println("ʹ��MD5�����������");
		return pwd;
	}
}

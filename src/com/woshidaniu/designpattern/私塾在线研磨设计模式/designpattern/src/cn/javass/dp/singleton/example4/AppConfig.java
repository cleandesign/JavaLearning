package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.singleton.example4;

import java.io.*;
import java.util.*;
/**
 * ��ȡӦ�������ļ�������ʵ��
 */
public class AppConfig {
	/**
	 * ����һ���������洢�����õ���ʵ����ֱ�������ﴴ����ʵ����ֻ�ᴴ��һ��
	 */
	private static AppConfig instance = new AppConfig();
	/**
	 * ����һ��������Ϊ�ͻ����ṩAppConfig���ʵ��
	 * @return һ��AppConfig��ʵ��
	 */
	public static AppConfig getInstance(){
		return instance;
	}
	
	/**
	 * ������������ļ��в���A��ֵ
	 */
	private String parameterA;
	/**
	 * ������������ļ��в���B��ֵ
	 */
	private String parameterB;
	
	public String getParameterA() {
		return parameterA;
	}
	public String getParameterB() {
		return parameterB;
	}
	/**
	 * ˽�л����췽��
	 */
	private AppConfig(){
		//���ö�ȡ�����ļ��ķ���
		readConfig();
	}
	/**
	 * ��ȡ�����ļ����������ļ��е����ݶ��������õ�������
	 */
	private void readConfig(){
		Properties p = new Properties(); 
		InputStream in = AppConfig.class.getResourceAsStream("AppConfig.properties");
		try {
			p.load(in);
			//�������ļ��е����ݶ��������õ�������
			this.parameterA = p.getProperty("paramA");
			this.parameterB = p.getProperty("paramB");
		} catch (IOException e) {
			System.out.println("װ�������ļ������ˣ������ջ��Ϣ���£�");
			e.printStackTrace();
		}
	}
	
}

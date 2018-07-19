package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.adapter.example4;
import java.util.*;
public class Client {
	public static void main(String[] args) {
		//׼����־���ݣ�Ҳ���ǲ��Ե�����
		LogModel lm1 = new LogModel();
		lm1.setLogId("001");
		lm1.setOperateUser("admin");
		lm1.setOperateTime("2010-03-02 10:08:18");
		lm1.setLogContent("����һ������");
		
		List<LogModel> list = new ArrayList<LogModel>();
		list.add(lm1);

		//����������־�ļ��Ķ���
		LogFileOperateApi fileLogApi = new LogFileOperate("");
		LogDbOperateApi dbLogApi = new LogDbOperate();
		
		//��������˫�������Ĳ�����־�Ľӿڶ���
		LogFileOperateApi fileLogApi2 = new TwoDirectAdapter(fileLogApi,dbLogApi); 
		LogDbOperateApi dbLogApi2 = new TwoDirectAdapter(fileLogApi,dbLogApi); 
		
		//�Ȳ��Դ��ļ��������䵽�ڶ��棬��Ȼ���õ��ǵڶ���Ľӿڣ���ʵ���ļ�������ʵ��
		dbLogApi2.createLog(lm1);
		List<LogModel> allLog = dbLogApi2.getAllLog();
		System.out.println("allLog="+allLog);
		
		//�ٲ��Դ����ݿ�洢����ɵ�һ��Ľӿڣ�Ҳ���ǵ��õ�һ��Ľӿڣ���ʵ������ʵ��
		fileLogApi2.writeLogFile(list);
		fileLogApi2.readLogFile();
	}
}

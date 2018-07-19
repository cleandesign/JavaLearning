package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.adapter.example3;

import java.util.List;

/**
 * ���������󣬰Ѽ�¼��־���ļ��Ĺ�������ɵڶ�����Ҫ����ɾ�Ĳ�Ĺ���
 */
public class Adapter implements LogDbOperateApi{
	/**
	 * ������Ҫ������Ľӿڶ���
	 */
	private LogFileOperateApi adaptee;
	/**
	 * ���췽����������Ҫ������Ķ���
	 * @param adaptee ��Ҫ������Ķ���
	 */
	public Adapter(LogFileOperateApi adaptee) {
		this.adaptee = adaptee;
	}
	
	public void createLog(LogModel lm) {
		//1���ȶ�ȡ�ļ�������
		List<LogModel> list = adaptee.readLogFile();
		//2�������µ���־����
		list.add(lm);
		//3������д���ļ�
		adaptee.writeLogFile(list);
	}

	public List<LogModel> getAllLog() {
		return adaptee.readLogFile();
	}

	public void removeLog(LogModel lm) {
		//1���ȶ�ȡ�ļ�������
		List<LogModel> list = adaptee.readLogFile();
		//2��ɾ����Ӧ����־����
		list.remove(lm);
		//3������д���ļ�
		adaptee.writeLogFile(list);
	}

	public void updateLog(LogModel lm) {
		//1���ȶ�ȡ�ļ�������
		List<LogModel> list = adaptee.readLogFile();
		//2���޸���Ӧ����־����
		for(int i=0;i<list.size();i++){
			if(list.get(i).getLogId().equals(lm.getLogId())){
				list.set(i, lm);
				break;
			}
		}
		//3������д���ļ�
		adaptee.writeLogFile(list);
	}
}

package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.adapter.example5;

import java.util.List;

/**
 * ������������
 */
public class ClassAdapter extends LogFileOperate implements LogDbOperateApi{
	
	public ClassAdapter(String logFilePathName) {
		super(logFilePathName);
	}

	public void createLog(LogModel lm) {
		//1���ȶ�ȡ�ļ�������
		List<LogModel> list = this.readLogFile();
		//2�������µ���־����
		list.add(lm);
		//3������д���ļ�
		this.writeLogFile(list);
	}

	public List<LogModel> getAllLog() {
		return this.readLogFile();
	}

	public void removeLog(LogModel lm) {
		//1���ȶ�ȡ�ļ�������
		List<LogModel> list = this.readLogFile();
		//2��ɾ����Ӧ����־����
		list.remove(lm);
		//3������д���ļ�
		this.writeLogFile(list);
	}

	public void updateLog(LogModel lm) {
		//1���ȶ�ȡ�ļ�������
		List<LogModel> list = this.readLogFile();
		//2���޸���Ӧ����־����
		for(int i=0;i<list.size();i++){
			if(list.get(i).getLogId().equals(lm.getLogId())){
				list.set(i, lm);
				break;
			}
		}
		//3������д���ļ�
		this.writeLogFile(list);
	}
}

package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.adapter.example4;

import java.util.List;

/**
 * ˫������������
 */
public class TwoDirectAdapter implements LogDbOperateApi,LogFileOperateApi{
	/**
	 * ������Ҫ��������ļ��洢��־�Ľӿڶ���
	 */
	private LogFileOperateApi fileLog;
	/**
	 * ������Ҫ�������DB�洢��־�Ľӿڶ���
	 */
	private LogDbOperateApi  dbLog;
	/**
	 * ���췽����������Ҫ������Ķ���
	 * @param fileLog ��Ҫ��������ļ��洢��־�Ľӿڶ���
	 * @param dbLog ��Ҫ�������DB�洢��־�Ľӿڶ���
	 */
	public TwoDirectAdapter(LogFileOperateApi fileLog,LogDbOperateApi dbLog) {
		this.fileLog = fileLog;
		this.dbLog = dbLog;
	}
/*-----�����ǰ��ļ������ķ�ʽ�����ΪDBʵ�ַ�ʽ�Ľӿ�-----*/	
	public void createLog(LogModel lm) {
		//1���ȶ�ȡ�ļ�������
		List<LogModel> list = fileLog.readLogFile();
		//2�������µ���־����
		list.add(lm);
		//3������д���ļ�
		fileLog.writeLogFile(list);
	}

	public List<LogModel> getAllLog() {
		return fileLog.readLogFile();
	}

	public void removeLog(LogModel lm) {
		//1���ȶ�ȡ�ļ�������
		List<LogModel> list = fileLog.readLogFile();
		//2��ɾ����Ӧ����־����
		list.remove(lm);
		//3������д���ļ�
		fileLog.writeLogFile(list);
	}

	public void updateLog(LogModel lm) {
		//1���ȶ�ȡ�ļ�������
		List<LogModel> list = fileLog.readLogFile();
		//2���޸���Ӧ����־����
		for(int i=0;i<list.size();i++){
			if(list.get(i).getLogId().equals(lm.getLogId())){
				list.set(i, lm);
				break;
			}
		}
		//3������д���ļ�
		fileLog.writeLogFile(list);
	}
/*-----�����ǰ�DB�����ķ�ʽ�����Ϊ�ļ�ʵ�ַ�ʽ�Ľӿ�-----*/
	public List<LogModel> readLogFile() {
		return dbLog.getAllLog();
	}

	public void writeLogFile(List<LogModel> list) {
		//1����򵥵�ʵ��˼·����ɾ�����ݿ��е�����
		//2��Ȼ��ѭ�������ڵ����ݼ��뵽���ݿ���
		for(LogModel lm : list){
			dbLog.createLog(lm);
		}		
	}
}

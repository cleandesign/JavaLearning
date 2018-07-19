package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.adapter.example4;

import java.util.List;
/**
 * DB�洢��־��ʵ�֣�Ϊ�˼򵥣�����Ͳ�ȥ���ʵ�ֺ����ݿ⽻���ˣ�ʾ��һ��
 */
public class LogDbOperate implements LogDbOperateApi{

	public void createLog(LogModel lm) {
		System.out.println("now in LogDbOperate createLog,lm="+lm);
	}

	public List<LogModel> getAllLog() {
		System.out.println("now in LogDbOperate getAllLog");
		return null;
	}

	public void removeLog(LogModel lm) {
		System.out.println("now in LogDbOperate removeLog,lm="+lm);
	}

	public void updateLog(LogModel lm) {
		System.out.println("now in LogDbOperate updateLog,lm="+lm);
	}

}

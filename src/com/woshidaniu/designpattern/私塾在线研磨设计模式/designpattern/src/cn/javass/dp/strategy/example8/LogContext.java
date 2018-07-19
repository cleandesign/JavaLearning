package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.strategy.example8;


/**
 * ��־��¼��������
 */
public class LogContext {
	/**
	 * ��¼��־�ķ������ṩ���ͻ���ʹ��
	 * @param msg ���¼����־��Ϣ
	 */
	public void log(String msg){
		//�����������棬����ʵ�ֶԾ�����Ե�ѡ��
		//����ѡ�ò��ԣ���¼�����ݿ�
		LogStrategy strategy = new DbLog();
		try{
			strategy.log(msg);
		}catch(Exception err){
			//�����ˣ��Ǿͼ�¼���ļ���
			strategy = new FileLog();
			strategy.log(msg);
		}
	}	
}

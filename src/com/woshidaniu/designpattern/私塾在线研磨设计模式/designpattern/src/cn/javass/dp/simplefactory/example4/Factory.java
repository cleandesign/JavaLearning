package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.simplefactory.example4;

/**
 * �����࣬��������Api��
 */
public class Factory {
	/**
	 * ����Ĵ���Api�ķ��������ݿͻ��˵Ĳ����������ӿ�
	 * @param type �ͻ��˴����ѡ����ӿڵ�����
	 * @return ����õ�Api����
	 */
	public static Api createApi(int type){
		//�����typeҲ���Բ����ⲿ���룬����ֱ�Ӷ�ȡ�����ļ�����ȡ
		//Ϊ�˰�ע��������ģʽ�����ϣ�����Ͳ�ȥд��ȡ�����ļ��Ĵ�����
		
		//����type������ѡ�񣬵�Ȼ�����1��2Ӧ�����ɳ���
		Api api = null;
		if(type==1){
			api = new Impl();
		}else if(type==2){
			api = new Impl2();
		}
		return api;
	}
}
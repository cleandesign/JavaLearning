package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.templatemethod.example6;

import java.sql.PreparedStatement;
/**
 * �������ݿ�ķ���ʹ�õĻص��ӿ�
 */
public interface UpdateDBCallBack {
	/**
	 * ʹ��PreparedStatement����sql�е�"?"����
	 * @param pstmt PreparedStatement ����
	 * @throws Exception
	 */
	public void setValue(PreparedStatement pstmt)throws Exception;
}

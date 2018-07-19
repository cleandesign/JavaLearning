package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.state.example5;
/**
 * ��װһ��ͶƱ״̬��ص���Ϊ
 */
public interface VoteState {
	/**
	 * ����״̬��Ӧ����Ϊ
	 * @param user ͶƱ��
	 * @param voteItem ͶƱ��
	 * @param voteManager ͶƱ�����ģ�������ʵ��״̬��Ӧ�Ĺ��ܴ����ʱ��
	 *                    ���Իص������ĵ�����
	 */
	public void vote(String user, String voteItem, VoteManager voteManager);
}
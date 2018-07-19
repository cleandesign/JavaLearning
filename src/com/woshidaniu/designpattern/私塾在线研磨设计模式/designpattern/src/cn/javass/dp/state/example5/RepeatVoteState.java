package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.state.example5;

public class RepeatVoteState implements VoteState{
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//�ظ�ͶƱ
		//��ʱ��������
		System.out.println("�벻Ҫ�ظ�ͶƱ");
		
		//�ظ�ͶƱ��ɣ�ά����һ��״̬���ظ�ͶƱ��5�Σ��������ͶƱ��
		//ע���������жϴ��ڵ���4����Ϊ�������õ�����һ��״̬
		//��һ��������������5�ˣ���Ӧ�����Ƕ���ͶƱ��
		if(voteManager.getMapVoteCount().get(user) >= 4){
			voteManager.getMapState().put(user, new SpiteVoteState());
			//ֱ�Ӱ���һ��״̬�ı����¼�����ݿ�ͺ���
		}
	}
}
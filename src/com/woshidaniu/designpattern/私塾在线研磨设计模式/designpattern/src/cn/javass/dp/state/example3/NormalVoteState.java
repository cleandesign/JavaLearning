package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.state.example3;

public class NormalVoteState implements VoteState{
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//����ͶƱ
		//��¼��ͶƱ��¼��
		voteManager.getMapVote().put(user, voteItem);
		System.out.println("��ϲ��ͶƱ�ɹ�");
	}
}

package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.state.example3;

public class SpiteVoteState implements VoteState{
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//����ͶƱ
		//ȡ���û���ͶƱ�ʸ񣬲�ȡ��ͶƱ��¼
		String s = voteManager.getMapVote().get(user);
		if(s!=null){
			voteManager.getMapVote().remove(user);
		}
		System.out.println("���ж���ˢƱ��Ϊ��ȡ��ͶƱ�ʸ�");
	}
}
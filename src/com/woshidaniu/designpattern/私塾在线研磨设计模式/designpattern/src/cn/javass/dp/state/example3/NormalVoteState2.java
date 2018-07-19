package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.state.example3;

public class NormalVoteState2 extends NormalVoteState{
	public void vote(String user, String voteItem, VoteManager voteManager) {
		//�ȵ������еĹ���
		super.vote(user, voteItem, voteManager);
		//������ֽ�����ʾ��һ��
		System.out.println("��������10��");
	}
}

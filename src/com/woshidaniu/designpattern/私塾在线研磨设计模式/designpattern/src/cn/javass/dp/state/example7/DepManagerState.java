package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.state.example7;

/**
 * �����ž������ˣ�������Ӧ��˽���״̬
 */
public class DepManagerState implements LeaveRequestState{
	public void doWork(StateMachine request) {
		//�Ȱ�ҵ��������ͻ���
		LeaveRequestModel lrm = (LeaveRequestModel)request.getBusinessVO();

		//ҵ��������˽�����浽���ݿ���
		
		//���ž�����˹���ֱ��ת����˽���״̬��
		request.setState(new AuditOverState());

		//������������һ�������������쿴��˽��
	}
}

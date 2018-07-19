package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.chainofresponsibility.example3;

public class GeneralManager extends Handler{
	public String handleFeeRequest(String user, double fee) {
		String str = "";
		//�ܾ����Ȩ�޺ܴ�ֻҪ����������������Դ���
		if(fee >= 1000){
			//Ϊ�˲��ԣ��򵥵㣬ֻͬ��С���
			if("С��".equals(user)){
				str = "�ܾ���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
			}else{
				//������һ�ɲ�ͬ��
				str = "�ܾ���ͬ��"+user+"�۲ͷ���"+fee+"Ԫ������";
			}
			return str;
		}else{
			//������к�̵Ĵ�����󣬼�������
			if(this.successor!=null){
				return successor.handleFeeRequest(user, fee);
			}
		}
		return str;
	}

}

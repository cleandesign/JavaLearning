package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.interpreter.example3;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/**
 * Ԫ����Ϊ�ս����Ӧ�Ľ�����
 */
public class ElementTerminalExpression  extends ReadXmlExpression{
	/**
	 * Ԫ�ص�����
	 */
	private String eleName = "";
	public ElementTerminalExpression(String name){
		this.eleName = name;
	}
	
	public String[] interpret(Context c) {
		//��ȡ����������ĵ�ǰԪ����Ϊ����Ԫ��
		Element pEle = c.getPreEle();
		//���ҵ���ǰԪ����������Ӧ��xmlԪ��
		Element ele = null;
		if(pEle==null){
			//˵�����ڻ�ȡ���Ǹ�Ԫ��
			ele = c.getDocument().getDocumentElement();
			c.setPreEle(ele);
		}else{
			//���ݸ���Ԫ�غ�Ҫ���ҵ�Ԫ�ص���������ȡ��ǰ��Ԫ��
			ele = c.getNowEle(pEle, eleName);
			//�ѵ�ǰ��ȡ��Ԫ�طŵ�����������
			c.setPreEle(ele);
		}

		//Ȼ����Ҫȥ��ȡ���Ԫ�ص�ֵ
		String[] ss = new String[1];
		ss[0] = ele.getFirstChild().getNodeValue();
		return ss;
	}
}

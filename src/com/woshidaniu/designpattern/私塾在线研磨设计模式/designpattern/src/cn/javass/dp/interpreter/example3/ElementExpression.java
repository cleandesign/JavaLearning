package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.interpreter.example3;
import java.util.*;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/**
 * Ԫ����Ϊ���ս����Ӧ�Ľ����������Ͳ�ִ���м�Ԫ��
 */
public class ElementExpression extends ReadXmlExpression{
	/**
	 * ������¼��ϵ�ReadXmlExpressionԪ��
	 */
	private Collection<ReadXmlExpression> eles = new ArrayList<ReadXmlExpression>();
	/**
	 * Ԫ�ص�����
	 */
	private String eleName = "";
	public ElementExpression(String eleName){
		this.eleName = eleName;
	}
	public boolean addEle(ReadXmlExpression ele){
		this.eles.add(ele);
		return true;
	}
	public boolean removeEle(ReadXmlExpression ele){
		this.eles.remove(ele);
		return true;
	}
	
	public String[] interpret(Context c) {
		//��ȡ����������ĵ�ǰԪ����Ϊ����Ԫ��
		//���ҵ���ǰԪ����������Ӧ��xmlԪ�أ������ûص���������
		Element pEle = c.getPreEle();
		if(pEle==null){
			//˵�����ڻ�ȡ���Ǹ�Ԫ��
			c.setPreEle(c.getDocument().getDocumentElement());
		}else{
			//���ݸ���Ԫ�غ�Ҫ���ҵ�Ԫ�ص���������ȡ��ǰ��Ԫ��
			Element nowEle = c.getNowEle(pEle, eleName);
			//�ѵ�ǰ��ȡ��Ԫ�طŵ�����������
			c.setPreEle(nowEle);
		}
		
		//ѭ��������Ԫ�ص�interpret����
		String [] ss = null;
		for(ReadXmlExpression ele : eles){
			ss = ele.interpret(c);
		}
		return ss;
	}
}

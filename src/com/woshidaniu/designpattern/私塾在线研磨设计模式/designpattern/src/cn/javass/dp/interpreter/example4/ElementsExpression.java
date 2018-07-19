package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.interpreter.example4;
import java.util.*;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/**
 * ���Ԫ����Ϊ���ս���Ľ��ʹ������
 */
public class ElementsExpression extends ReadXmlExpression{
	/**
	 * ������¼��ϵ�ReadXmlExpressionԪ��
	 */
	private Collection<ReadXmlExpression> eles = new ArrayList<ReadXmlExpression>();
	/**
	 * Ԫ������
	 */
	private String eleName = "";
	public ElementsExpression(String eleName){
		this.eleName = eleName;
	}
	
	public String[] interpret(Context c) {
		//��ȡ����������ĸ���Ԫ��
		List<Element> pEles = c.getPreEles();
		//�ѵ�ǰ��ȡ��Ԫ�طŵ����������棬����ǻ�ȡ���Ԫ��
		List<Element> nowEles = new ArrayList<Element>();
		
		for(Element ele : pEles){
			nowEles.addAll(c.getNowEles(ele, eleName));
		}
		c.setPreEles(nowEles);
		
		//ѭ��������Ԫ�ص�interpret����
		String [] ss = null;
		for(ReadXmlExpression ele : eles){
			ss = ele.interpret(c);
		}
		return ss;
	}
	
	public boolean addEle(ReadXmlExpression ele){
		this.eles.add(ele);
		return true;
	}
	public boolean removeEle(ReadXmlExpression ele){
		this.eles.remove(ele);
		return true;
	}
}

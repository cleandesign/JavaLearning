package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.interpreter.example4;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Client {
	public static void main(String[] args) throws Exception {
		//׼��������
		Context c = new Context("InterpreterTest.xml");

		//��Ҫ��ȡ���dԪ�ص�ֵ��Ҳ�������±��ʽ��ֵ��"root/a/b/d$"

//		//����Ҫ�����������ĳ����﷨��
//		ElementExpression root = new ElementExpression("root");
//		ElementExpression aEle = new ElementExpression("a");
//		ElementExpression bEle = new ElementExpression("b");
//		ElementsTerminalExpression dEle = new ElementsTerminalExpression("d");
//		//�������
//		root.addEle(aEle);
//		aEle.addEle(bEle);
//		bEle.addEle(dEle);
//		//����
//		String ss[] = root.interpret(c);
//		for(String s : ss){
//			System.out.println("d��ֵ��="+s);	
//		}

		//��Ҫ��ȡdԪ�ص�id���ԣ�Ҳ�������±��ʽ��ֵ��"a/b/d$.id$"
		ElementExpression root = new ElementExpression("root");
		ElementExpression aEle = new ElementExpression("a");
		ElementExpression bEle = new ElementExpression("b");
		ElementsExpression dEle = new ElementsExpression("d");
		PropertysTerminalExpression prop = new PropertysTerminalExpression("id");
		//���
		root.addEle(aEle);
		aEle.addEle(bEle);
		bEle.addEle(dEle);
		dEle.addEle(prop);
		//����
		String ss[] = root.interpret(c);
		for (String s : ss) {
			System.out.println("d������idֵ��=" + s);
		}
		
		//���Ҫʹ��ͬһ�������ģ��������н�������Ҫ���³�ʼ�������Ķ���
		//����Ҫ�����������ٻ�ȡһ������id��ֵ����Ȼ������������Ԫ�أ�
		//���½�����ֻҪ����ʹ��ͬһ�������ģ�����Ҫ���³�ʼ�������Ķ���
		c.reInit();
		String ss2[] = root.interpret(c);
		for (String s : ss2) {
			System.out.println("���»�ȡd������idֵ��=" + s);
		}
	}
}

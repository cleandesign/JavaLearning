package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.interpreter.example3;
/**
 * ������Ϊ�ս����Ӧ�Ľ�����
 */
public class PropertyTerminalExpression extends ReadXmlExpression{
	/**
	 * ���Ե�����
	 */
	private String propName;
	public PropertyTerminalExpression(String propName){
		this.propName = propName;
	}
	
	public String[] interpret(Context c) {
		//ֱ�ӻ�ȡ����Ԫ�ص����Ե�ֵ
		String[] ss = new String[1];
		ss[0] = c.getPreEle().getAttribute(this.propName);
		return ss;
	}
}

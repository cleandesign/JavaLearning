package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example6;
/**
 * Ҷ�Ӷ����൱�ڷ�����ģʽ�ľ���Elementʵ�ֶ���
 */
public class Leaf extends Component{
	public void accept(Visitor visitor) {
		//�ص������߶������Ӧ����
		visitor.visitLeaf(this);
	}
	/**
	 * Ҷ�Ӷ��������
	 */
	private String name = "";
	/**
	 * ���췽��������Ҷ�Ӷ��������
	 * @param name Ҷ�Ӷ��������
	 */
	public Leaf(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
}

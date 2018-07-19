package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.visitor.example5;
import java.util.*;
/**
 * ��϶��󣬿��԰���������϶������Ҷ�Ӷ���
 * �൱�ڷ�����ģʽ�ľ���Elementʵ�ֶ���
 */
public class Composite extends Component{
	public void accept(Visitor visitor) {
		//�ص������߶������Ӧ����
		visitor.visitComposite(this);
		//ѭ����Ԫ�أ�����Ԫ��Ҳ���ܷ���
		for(Component c : childComponents){
			//�����Ӷ�����ܷ��ʣ�����ʵ�ֵݹ�
			c.accept(visitor);
		}
	}
	/**
	 * �����洢��϶����а��������������
	 */
	private List<Component> childComponents = new ArrayList<Component>();
	/**
	 * ��϶��������
	 */
	private String name = "";
	/**
	 * ���췽����������϶��������
	 * @param name ��϶��������
	 */
	public Composite(String name){
		this.name = name;
	}
	
	public void addChild(Component child) {
		childComponents.add(child);
	}
	public String getName() {
		return name;
	}
}

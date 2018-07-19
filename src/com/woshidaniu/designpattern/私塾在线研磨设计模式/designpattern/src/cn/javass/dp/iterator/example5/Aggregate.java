package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.iterator.example5;

import java.util.*;
/**
 * �ۺ϶���Ľӿڣ����崴����Ӧ����������Ľӿ�
 */
public abstract class Aggregate {
	/**
	 * ����������������Ӧ����������Ľӿ�
	 * @return ��Ӧ����������Ľӿ�
	 */
	public abstract Iterator createIterator();
}

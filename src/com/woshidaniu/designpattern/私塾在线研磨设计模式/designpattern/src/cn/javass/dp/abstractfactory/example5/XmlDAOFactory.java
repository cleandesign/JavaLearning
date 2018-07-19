package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.abstractfactory.example5;

public class XmlDAOFactory extends DAOFactory {
	public OrderDetailDAO createOrderDetailDAO() {
		return new XmlDetailDAOImpl();
	}
	public OrderMainDAO createOrderMainDAO() {
		return new XmlMainDAOImpl();
	}
}
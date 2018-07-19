package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.chainofresponsibility.example6;

/**
 * ��װ���۵������ݣ��򵥵�ʾ��һЩ
 */
public class SaleModel {
	/**
	 * ���۵���Ʒ
	 */
	private String goods;
	/**
	 * ���۵�����
	 */
	private int saleNum;
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public int getSaleNum() {
		return saleNum;
	}
	public void setSaleNum(int saleNum) {
		this.saleNum = saleNum;
	}
	
	public String toString(){
		return "��Ʒ����="+goods+",��������="+saleNum;
	}
}

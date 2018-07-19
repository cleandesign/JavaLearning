package com.woshidaniu.designpattern.私塾在线研磨设计模式.designpattern.src.cn.javass.dp.memento.example4;

public class AddCommand extends AbstractCommand{
	
	private int opeNum;
	public AddCommand(int opeNum){
		this.opeNum = opeNum;
	}	
	
	public void execute() {
		this.operation.add(opeNum);
	}
}

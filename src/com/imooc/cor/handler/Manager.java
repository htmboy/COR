package com.imooc.cor.handler;

public class Manager extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		// TODO Auto-generated method stub
		if(discount <= 0.3) 
			System.out.format("%s��׼���ۿ�: %.2f%n", this.getClass().getName(), discount);
		else
			successor.processDiscount(discount);
	}

}

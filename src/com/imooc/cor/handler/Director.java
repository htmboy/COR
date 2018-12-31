package com.imooc.cor.handler;

public class Director extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		// TODO Auto-generated method stub
		if(discount <= 0.4) 
			System.out.format("%sÅú×¼ÁËÕÛ¿Û: %.2f%n", this.getClass().getName(), discount);
		else
			successor.processDiscount(discount);
	}

}

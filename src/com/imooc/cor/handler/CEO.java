package com.imooc.cor.handler;

public class CEO extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		// TODO Auto-generated method stub
		if(discount <= 0.55) 
			System.out.format("%s��׼���ۿ�: %.2f%n", this.getClass().getName(), discount);
		else
			System.out.format("%s�ܾ����ۿ�: %.2f%n", this.getClass().getName(), discount);
	}

}

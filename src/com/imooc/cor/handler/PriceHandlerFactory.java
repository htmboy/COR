package com.imooc.cor.handler;

public class PriceHandlerFactory {

	/**
	 * ����PriceHandler��������
	 * @return
	 */
	public static PriceHandler createPriceHandler() {
		
		PriceHandler sales = new Sales();
		PriceHandler man = new Manager();
		PriceHandler dir = new Director();
		PriceHandler vp = new VicePresident();
		PriceHandler ceo = new CEO();
		sales.setSuccessor(man);
		man.setSuccessor(dir);
		dir.setSuccessor(vp);
		vp.setSuccessor(ceo);
		return sales;
	}

}

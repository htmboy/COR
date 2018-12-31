package com.imooc.cor.handler;
/**
 * �۸�����, ������ͻ��ۿ�����
 * @author aooled-laptop
 *
 */
public abstract class PriceHandler {
	/**
	 * ֱ�Ӻ��, ���ڴ�������
	 */
	protected PriceHandler successor;

	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}
	
	public abstract void processDiscount(float discount);
}

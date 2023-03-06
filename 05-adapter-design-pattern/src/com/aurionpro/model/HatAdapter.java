package com.aurionpro.model;

public class HatAdapter implements IItems {
	
	private Hat hat;
	

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		return hat.getLongname();
		
	}

	@Override
	public double getItemPrice() {
		return hat.getBasicPrice()+(hat.getBasicPrice()*hat.getTax()/100);

	}

}

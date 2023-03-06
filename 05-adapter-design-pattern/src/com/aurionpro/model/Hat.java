package com.aurionpro.model;

public class Hat {
	private String shortname;
	private String longname;
	private double basicPrice;
	private double tax;
	public Hat(String shortname, String longname, double basicPrice, double tax) {
		super();
		this.shortname = shortname;
		this.longname = longname;
		this.basicPrice = basicPrice;
		this.tax = tax;
	}
	public String getShortname() {
		return shortname;
	}
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	public String getLongname() {
		return longname;
	}
	public void setLongname(String longname) {
		this.longname = longname;
	}
	public double getBasicPrice() {
		return basicPrice;
	}
	public void setBasicPrice(double basicPrice) {
		this.basicPrice = basicPrice;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}

}

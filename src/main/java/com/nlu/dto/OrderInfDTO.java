package com.nlu.dto;

public class OrderInfDTO {
	String capacity;
	int price;
	int stayNumber;
	int subTotal;
	int taxPercent;
	int taxPrice;
	int totalPrice;

	public int getTaxPrice() {
		return taxPrice;
	}

	public void setTaxPrice(int taxPrice) {
		this.taxPrice = taxPrice;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStayNumber() {
		return stayNumber;
	}

	public void setStayNumber(int stayNumber) {
		this.stayNumber = stayNumber;
	}

	public int getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}

	public int getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(int taxPercent) {
		this.taxPercent = taxPercent;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}

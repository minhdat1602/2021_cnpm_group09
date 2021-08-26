package com.nlu.payload;

public class PaymentInfPayload {
	String cardHolderName;
	String cardNumber;
	String password;
	String expriedTime;

	public PaymentInfPayload() {
		super();
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getExpriedTime() {
		return expriedTime;
	}

	public void setExpriedTime(String expriedTime) {
		this.expriedTime = expriedTime;
	}

	@Override
	public String toString() {
		return "PaymentInfPayload [cardHolderName=" + cardHolderName + ", cardNumber=" + cardNumber + ", password="
				+ password + ", expriedTime=" + expriedTime + "]";
	}

}

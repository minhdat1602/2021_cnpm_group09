package com.nlu.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class CardEntity extends BaseEntity {
	String cardHolderName;
	String cardNumber;
	String expriedTime;
	
	@OneToMany(mappedBy = "card")
	List<OrderEntity> orders;
	
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

	public String getExpriedTime() {
		return expriedTime;
	}

	public void setExpriedTime(String expriedTime) {
		this.expriedTime = expriedTime;
	}

}

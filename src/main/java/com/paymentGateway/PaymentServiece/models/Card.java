package com.paymentGateway.PaymentServiece.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
 private Long id;
 private String cardHolderName;
 private Long cardNumber;
 private Double amount;
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getCardHolderName() {
    return cardHolderName;
}
public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
}
public Long getCardNumber() {
    return cardNumber;
}
public void setCardNumber(Long cardNumber) {
    this.cardNumber = cardNumber;
}
public Double getAmount() {
    return amount;
}
public void setAmount(Double amount) {
    this.amount = amount;
}   
}

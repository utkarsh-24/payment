package com.paymentGateway.PaymentServiece.request;

public class CardUpdateRequest {
    private Long cardNumber;
    private Double amount;
    private String baseCurrency;
    private String quoteCurrency;
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
    public String getBaseCurrency() {
        return baseCurrency;
    }
    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }
    public String getQuoteCurrency() {
        return quoteCurrency;
    }
    public void setQuoteCurrency(String quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
    }
}

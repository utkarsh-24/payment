package com.paymentGateway.PaymentServiece.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CurrencyExchangeRate {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String quoteCurrency;
    private String baseCurrency;
    private String quoteCountry;
    private String baseCountry;
    private Double exchangeRate;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getQuoteCurrency() {
        return quoteCurrency;
    }
    public void setQuoteCurrency(String quoteCurrency) {
        this.quoteCurrency = quoteCurrency;
    }
    public String getBaseCurrency() {
        return baseCurrency;
    }
    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }
    public String getQuoteCountry() {
        return quoteCountry;
    }
    public void setQuoteCountry(String quoteCountry) {
        this.quoteCountry = quoteCountry;
    }
    public String getBaseCountry() {
        return baseCountry;
    }
    public void setBaseCountry(String baseCountry) {
        this.baseCountry = baseCountry;
    }
    public Double getExchangeRate() {
        return exchangeRate;
    }
    public void setExchangeRate(Double excahangeRate) {
        this.exchangeRate = exchangeRate;
    }
    
}

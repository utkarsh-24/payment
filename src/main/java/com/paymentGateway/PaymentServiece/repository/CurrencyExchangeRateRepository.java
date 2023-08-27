package com.paymentGateway.PaymentServiece.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentGateway.PaymentServiece.models.CurrencyExchangeRate;

public interface CurrencyExchangeRateRepository extends JpaRepository<CurrencyExchangeRate,Long>{

    CurrencyExchangeRate findByBaseCurrencyAndQuoteCurrency(String baseCurrency, String quoteCurrency);
    
}

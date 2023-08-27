package com.paymentGateway.PaymentServiece.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentGateway.PaymentServiece.models.CurrencyExchangeRate;
import com.paymentGateway.PaymentServiece.repository.CurrencyExchangeRateRepository;

@Service
public class CurrencyExchangeRateService {
    @Autowired
    CurrencyExchangeRateRepository currencyExchangeRateRepository;

    public List<CurrencyExchangeRate> getAll()
    {
        return currencyExchangeRateRepository.findAll();
    }

    public CurrencyExchangeRate getCurrencyExchangeRate(String baseCurrency,String quoteCurrency)
    {
        return currencyExchangeRateRepository.findByBaseCurrencyAndQuoteCurrency(baseCurrency,quoteCurrency);
    }
}

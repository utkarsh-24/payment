package com.paymentGateway.PaymentServiece.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentGateway.PaymentServiece.models.CurrencyExchangeRate;
import com.paymentGateway.PaymentServiece.service.CurrencyExchangeRateService;

@RestController
@RequestMapping("/api/v1/currencyExchangeRate")
public class CurrencyExchangeRateController {
    @Autowired
    CurrencyExchangeRateService currencyExchangeRateService;

    @GetMapping()
    public List<CurrencyExchangeRate> get(){
        return currencyExchangeRateService.getAll();
    }
}

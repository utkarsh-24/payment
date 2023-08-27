package com.paymentGateway.PaymentServiece.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paymentGateway.PaymentServiece.models.Card;
import com.paymentGateway.PaymentServiece.models.CurrencyExchangeRate;
import com.paymentGateway.PaymentServiece.request.CardUpdateRequest;
import com.paymentGateway.PaymentServiece.service.CardService;
import com.paymentGateway.PaymentServiece.service.CurrencyExchangeRateService;

@RestController
@RequestMapping("/api/v1/card")
public class CardController {
    @Autowired
    CardService cardService;
    @Autowired
    CurrencyExchangeRateService currencyExchangeRateService;
    @GetMapping()
    public List<Card> get()
    {
        return cardService.getAll();
    }

    @PostMapping("/update-card-amount")
    public ResponseEntity<String> updateCardAmount(@RequestBody CardUpdateRequest request) {
        // Get card by cardNumber
        Card card = cardService.getCardByCardNumber(request.getCardNumber());
        
        // Get currency exchange rate
        CurrencyExchangeRate exchangeRate = currencyExchangeRateService.getCurrencyExchangeRate(
            request.getBaseCurrency(), request.getQuoteCurrency()
        );
        
        if (card != null && exchangeRate != null) {
            // Get Converted Amount
            Double convertedAmount = request.getAmount() * exchangeRate.getExchangeRate();
            
            // Calculate updated amount
            Double updatedAmount = card.getAmount() + convertedAmount;
            
            // Update card amount
            card.setAmount(updatedAmount);
            cardService.saveCard(card);
            
            return ResponseEntity.ok("Card amount updated successfully.");
        } else {
            return ResponseEntity.badRequest().body("Invalid card number or currency.");
        }
    }
}

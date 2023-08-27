package com.paymentGateway.PaymentServiece.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paymentGateway.PaymentServiece.models.Card;

import com.paymentGateway.PaymentServiece.repository.CardRepository;

@Service
public class CardService {
    @Autowired
    CardRepository cardRepository;

    public List<Card> getAll()
    {
        return cardRepository.findAll();
    }

    public Card getCardByCardNumber(Long cardNumber)
    {
        return cardRepository.getByCardNumber(cardNumber);
    }

    public Card saveCard(Card card)
    {
        return cardRepository.save(card);
    }
}

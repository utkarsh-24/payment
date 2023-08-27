package com.paymentGateway.PaymentServiece.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paymentGateway.PaymentServiece.models.Card;

public interface CardRepository extends JpaRepository<Card,Long>{

    Card getByCardNumber(Long cardNumber);
    
}

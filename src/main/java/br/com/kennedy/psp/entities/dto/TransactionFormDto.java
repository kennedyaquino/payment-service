package br.com.kennedy.psp.entities.dto;

import br.com.kennedy.psp.entities.PaymentMethod;

import java.math.BigDecimal;

public record TransactionFormDto (
    BigDecimal value,
    String description,
    PaymentMethod paymentMethod,
    Integer numberCard,
    String cardHoldName,
    String cardExpirationDate,
    Integer codeVerificationCard,
    String idClient
){}

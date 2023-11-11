package br.com.kennedy.psp.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Transactions {

    private String id;
    private BigDecimal value;
    private String description;
    private PaymentMethod paymentMethod;
    private Integer numberCard;
    private String cardHoldName;
    private String cardExpirationDate;
    private Integer codeVerificationCard;
    private LocalDate transactionDate;

    public Transactions() {
    }

    public Transactions(String id, BigDecimal value, String description, PaymentMethod paymentMethod, Integer numberCard, String cardHoldName, String cardExpirationDate, Integer codeVerificationCard, LocalDate transactionDate) {
        this.id = id;
        this.value = value;
        this.description = description;
        this.paymentMethod = paymentMethod;
        this.numberCard = numberCard;
        this.cardHoldName = cardHoldName;
        this.cardExpirationDate = cardExpirationDate;
        this.codeVerificationCard = codeVerificationCard;
        this.transactionDate = transactionDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Integer getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(Integer numberCard) {
        this.numberCard = numberCard;
    }

    public String getCardHoldName() {
        return cardHoldName;
    }

    public void setCardHoldName(String cardHoldName) {
        this.cardHoldName = cardHoldName;
    }

    public String getCardExpirationDate() {
        return cardExpirationDate;
    }

    public void setCardExpirationDate(String cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
    }

    public Integer getCodeVerificationCard() {
        return codeVerificationCard;
    }

    public void setCodeVerificationCard(Integer codeVerificationCard) {
        this.codeVerificationCard = codeVerificationCard;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transactions that = (Transactions) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

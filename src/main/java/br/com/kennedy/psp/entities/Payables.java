package br.com.kennedy.psp.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_payables")
public class Payables {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private StatusPayable statusPayable;
    private LocalDate paymentDate;
    private Double fee;
    private BigDecimal value;
    private Client client;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StatusPayable getStatusPayable() {
        return statusPayable;
    }

    public void setStatusPayable(StatusPayable statusPayable) {
        this.statusPayable = statusPayable;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payables payables = (Payables) o;
        return Objects.equals(id, payables.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

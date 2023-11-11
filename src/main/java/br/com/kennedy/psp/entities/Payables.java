package br.com.kennedy.psp.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Payables {

    private String id;
    private StatusPayable statusPayable;
    private LocalDate paymentDate;
    private Integer fee;
    private BigDecimal value;

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

    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
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

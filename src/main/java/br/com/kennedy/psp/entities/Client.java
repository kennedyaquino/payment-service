package br.com.kennedy.psp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_client")
public class Client {

    private String id;
    private BigDecimal balancePaid;
    private BigDecimal balanceWaitingFunds;

    public Client() {
    }

    public Client(BigDecimal balancePaid, BigDecimal balanceWaitingFunds) {
        this.balancePaid = balancePaid;
        this.balanceWaitingFunds = balanceWaitingFunds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getBalancePaid() {
        return balancePaid;
    }

    public void setBalancePaid(BigDecimal balancePaid) {
        this.balancePaid = balancePaid;
    }

    public BigDecimal getBalanceWaitingFunds() {
        return balanceWaitingFunds;
    }

    public void setBalanceWaitingFunds(BigDecimal balanceWaitingFunds) {
        this.balanceWaitingFunds = balanceWaitingFunds;
    }
}

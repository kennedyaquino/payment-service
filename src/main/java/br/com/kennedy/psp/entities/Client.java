package br.com.kennedy.psp.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
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

    public BigDecimal getBalanceWaitingFunds() {
        return balanceWaitingFunds;
    }

}

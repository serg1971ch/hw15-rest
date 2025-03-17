package ru.otus.hw15_otusRest.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "transfers")
@NoArgsConstructor
@AllArgsConstructor
public class Transfer {
    @Id
    @Column(name = "id")
    private String id;

    @OneToOne
    private Account accountSource;

    @OneToOne
    private Account  accountTarget;

    @Column(name = "message")
    private String message;

    @Column(name = "amount")
    private int amount;

    public Account getAccountSource() {
        return accountSource;
    }

    public void setAccountSource(Account accountSource) {
        this.accountSource = accountSource;
    }

    public Account getAccountTarget() {
        return accountTarget;
    }

    public void setAccountTarget(Account accountTarget) {
        this.accountTarget = accountTarget;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

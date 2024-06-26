package com.smartbudget.budgetmanagement.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "budgets")
public class Budget {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @JoinColumn(name = "user_id", nullable = false)
    private Long userId;
    private String name;

    @JoinColumn(name = "currency_code")
    private String currencyCode;
    private BigDecimal amount;
    private BigDecimal spent;
    private BigDecimal goal;
    private BigDecimal user_limit;

    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getSpent() {
        return spent;
    }

    public void setSpent(BigDecimal spent) {
        this.spent = spent;
    }

    public BigDecimal getGoal() {
        return goal;
    }

    public void setGoal(BigDecimal goal) {
        this.goal = goal;
    }

    public BigDecimal getLimit() {
        return user_limit;
    }

    public void setLimit(BigDecimal limit) {
        this.user_limit = limit;
    }

    @Override
    public String toString() {
        return      "BudgetId: " + id +
                    ", userId: " + userId +
                    ", name: " + name +
                    ", currencyCode: " + currencyCode +
                    ", amount: " + amount +
                    ", spent: " + spent +
                    ", goal: " + goal +
                    ", user_limit: " + user_limit;
    }
}


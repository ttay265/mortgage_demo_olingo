package com.morgage.model;

import javax.persistence.*;

@Entity
public class TransactionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "base_price")
    private Integer basePrice;
    @Column(name = "interest_day_period")
    private String interestDayPeriod;
    @Column(name = "interest")
    private String interest;
    @Column(name = "transaction_id")
    private Integer transactionId;

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    public String getInterestDayPeriod() {
        return interestDayPeriod;
    }

    public void setInterestDayPeriod(String interestDayPeriod) {
        this.interestDayPeriod = interestDayPeriod;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public TransactionItem(String name, String description, Integer basePrice, String interestDayPeriod, String interest) {
        this.name = name;
        this.description = description;
        this.basePrice = basePrice;
        this.interestDayPeriod = interestDayPeriod;
        this.interest = interest;
    }

    public TransactionItem() {
    }
}

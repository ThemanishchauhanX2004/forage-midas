package com.jpmc.midascore.foundation;

public class Transaction {

    private String id;
    private String type;
    private double amount;
    private String timestamp;
    private String status;

    public Transaction() {
    }

    public Transaction(String id, String type, double amount, String timestamp, String status) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.timestamp = timestamp;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    // ⭐ This was missing — this caused your Maven error
    public void setStatus(String status) {
        this.status = status;
    }
}

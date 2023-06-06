package org.example;

class USD extends Currency {
    private double amount;

    public USD(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
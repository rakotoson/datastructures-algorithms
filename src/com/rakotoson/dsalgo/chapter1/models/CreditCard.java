package com.rakotoson.dsalgo.chapter1.models;

public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public CreditCard(String customer, String bank, String account, int limit) {
        this(customer, bank, account, limit, 0.0);
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    /*
     * @param price the amount to be charged
     */
    public boolean charge(double price) {
        if(price+balance > limit) return false;

        balance += price;
        return true;
    }

    /**
     * Reinforcement 1-11 Modify the CreditCard class from Code Fragment 1.5
     * to include a method that updates the credit limit.
     */

    public void updateCreditCardLimit(int limit) {
        this.limit = limit;
    }

    /**
     *
     * @param amount amount to make a payment
     */

    public void makePayment(double amount) {
        if(balance >= amount) balance -= amount;
    }

    public void printSummary(CreditCard card) {
        System.out.println("Customer: " + card.customer);
        System.out.println("Bank: " + card.bank);
        System.out.println("Account: " + card.account);
        System.out.println("Limit: " + card.limit);
        System.out.println("Balance: " + card.balance);
    }
}

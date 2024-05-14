package com.alkewallet1.app;

public class User {
    private String userId;
    private Wallet wallet;

    public User(String userId) {
        this.userId = userId;
        this.wallet = new Wallet();
    }

    public String getUserId() {
        return userId;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void printBalance() {
        System.out.println("Saldo final: " + wallet.getBalance() + " CLP");
    }
}

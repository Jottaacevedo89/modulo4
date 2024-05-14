package com.alkewallet1.app;

public class Wallet {
    private int balance;

    public Wallet() {
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 300) {
            balance += amount;
            System.out.println("Deposito exitoso. Nuevo saldo: " + balance);
        } else {
            System.out.println("Depósito debe ser mayor a $300 CLP");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Retiro exitoso. Nuevo saldo: " + balance);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }
}

package com.alkewallet1.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // inicio de sesión
        final String expectedUsername = "12345678-9";
        final String expectedPassword = "Javieranuf0";

        // usuario y contrasena
        System.out.println("Ingrese usuario:");
        String username = scanner.nextLine();
        System.out.println("Ingrese contraseña:");
        String password = scanner.nextLine();

        
        if (username.equals(expectedUsername) && password.equals(expectedPassword)) {
            System.out.println("Bienvenido a Alke Wallet, Usuario: " + username);
        } else {
            System.out.println("Usuario o contrasena incorrectos.");
            scanner.close();
            return; 
        }

        
        User user = new User(username);

        while (true) {
            System.out.println("Selecciona el número de opción:");
            System.out.println("1: Consultar Saldo");
            System.out.println("2: Realizar depósito");
            System.out.println("3: Realizar retiro de dinero");
            System.out.println("4: Conversión de moneda");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1: 
                    user.printBalance();
                    break;
                case 2: 
                    System.out.println("Ingrese el monto a depositar en pesos chilenos (CLP):");
                    int depositAmount = scanner.nextInt();
                    user.getWallet().deposit(depositAmount);
                    break;
                case 3: 
                    System.out.println("Ingrese el monto que desea retirar en pesos chilenos (CLP):");
                    int withdrawAmount = scanner.nextInt();
                    user.getWallet().withdraw(withdrawAmount);
                    break;
                case 4: 
                    System.out.println("Introduzca la moneda a convertir (YAN, EUR, USD, CRYPTO):");
                    String currency = scanner.next();
                    int converted = CurrencyConverter.convertToCurrency(user.getWallet().getBalance(), currency);
                    System.out.println("Monto convertido en " + currency + ": " + converted);
                    break;
                default:
                    System.out.println("Opcion inválida, intente nuevamente.");
            }
            System.out.println("Desea realizar otra operación? (si/no)");
            if (scanner.next().equalsIgnoreCase("no")) {
                break;
            }
        }
        scanner.close();
        System.out.println("Gracias por preferir Alke Wallet.");
    }
}

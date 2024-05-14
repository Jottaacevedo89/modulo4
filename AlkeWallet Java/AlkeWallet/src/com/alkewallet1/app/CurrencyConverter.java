package com.alkewallet1.app;

public class CurrencyConverter {
    public static int convertToCurrency(int clpAmount, String currency) {
        switch (currency.toUpperCase()) {
            case "YAN":
                return (int) (clpAmount * 0.0092); 
            case "EUR":
                return (int) (clpAmount * 0.0011);
            case "USD":
                return (int) (clpAmount * 0.0012); 
            case "CRYPTO":
                return (int) (clpAmount * 0.00003); 
            default:
                System.out.println("Conversion de moneda no disponible.");
                return 0;
        }
    }
}

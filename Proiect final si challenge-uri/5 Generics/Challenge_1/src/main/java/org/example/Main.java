package org.example;

public class Main {
    public static void main(String[] args) {
        ExchangeDesk exchangeDesk = new ExchangeDesk();
        exchangeDesk.addRate(RON.class, USD.class, 4.1d);

        RON lei = new RON(1_000);
        USD dollar = exchangeDesk.convert(lei, USD.class);

        System.out.println("RON: " + lei.getAmount());
        System.out.println("USD: " + dollar.getAmount());
    }
}

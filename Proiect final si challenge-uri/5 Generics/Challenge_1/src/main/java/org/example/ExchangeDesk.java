package org.example;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class ExchangeDesk {
    private Map<Class<? extends Currency>, Map<Class<? extends Currency>, Double>> exchangeRates;

    public ExchangeDesk() {
        exchangeRates = new HashMap<>();
    }

    public <T extends Currency, U extends Currency> U convert(T sourceCurrency, Class<U> targetCurrencyClass) {
        double sourceAmount = sourceCurrency.getAmount();
        Class<? extends Currency> sourceCurrencyClass = sourceCurrency.getClass();
        Map<Class<? extends Currency>, Double> rates = exchangeRates.get(sourceCurrencyClass);

        if (rates != null) {
            Double exchangeRate = rates.get(targetCurrencyClass);
            if (exchangeRate != null) {
                double targetAmount = sourceAmount * exchangeRate;
                try {
                    U targetCurrency = targetCurrencyClass.getDeclaredConstructor().newInstance();
                    targetCurrency.setAmount(targetAmount);
                    return targetCurrency;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        throw new IllegalArgumentException("No exchange rate found for the given currencies.");
    }

    public <T extends Currency, U extends Currency> void addRate(Class<T> sourceCurrencyClass, Class<U> targetCurrencyClass, double exchangeRate) {
        exchangeRates.computeIfAbsent(sourceCurrencyClass, k -> new HashMap<>());
        exchangeRates.get(sourceCurrencyClass).put(targetCurrencyClass, exchangeRate);
        exchangeRates.computeIfAbsent(targetCurrencyClass, k -> new HashMap<>());
        exchangeRates.get(targetCurrencyClass).put(sourceCurrencyClass, 1 / exchangeRate);
    }
}


package org.campus02.oop;

import java.util.*;

public class PaymentJournal {


    ArrayList<Payment> payments = new ArrayList<>();

    public void add(Payment p) {
        payments.add(p);
    }

    public double totalTransactionCosts() {
        double totalTransactions = 0;
        for (Payment p : payments) {
            totalTransactions += p.calcTransactionCosts();
        }
        return totalTransactions;
    }

    public HashMap<String, Double> getPaymentsPerCurrency() {
        HashMap<String, Double> result = new HashMap<>();
        String currency = "";
        for (Payment p : payments) {
            currency = p.getCurrency();
            if (result.containsKey(currency)) {
                result.put(currency, result.get(currency) + 1.0);
            } else {
                result.put(currency, 1.0);

            }
        }
        return result;
    }
}
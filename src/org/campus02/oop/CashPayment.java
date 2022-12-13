package org.campus02.oop;

public class CashPayment extends Payment {

    private String name;

    public CashPayment(double amount, String currency) {
        super(amount, currency);
    }

    public CashPayment(double amount, String currency, String name) {
        super(amount, currency);
        this.name = name;
    }



    @Override
    public double calcTransactionCosts() {

        double transactionCosts = 0;
        if (name == null) {
            transactionCosts = 2;
        } else {
            transactionCosts = 0;
        }
        return transactionCosts;
    }

    @Override
    public String toString() {
        return "[CashPayment" + '\'' +
                ", Name='" + name + '\'' +
                ", Amount='" + getAmount() + '\'' +
                ", Currency='" + getAmount() + '\'' +
                ", TransactionCosts='" + calcTransactionCosts() + '\'' +
                ']';
    }
}




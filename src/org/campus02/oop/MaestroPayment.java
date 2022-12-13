package org.campus02.oop;

public class MaestroPayment extends Payment {

    private String cardNumber;

    public MaestroPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }

    @Override
    public double calcTransactionCosts() {
        double transitionCosts = 0;
        transitionCosts = exchangeToEUR() * 0.0075;

        if (transitionCosts < 0.95){
            transitionCosts = 0.95;
        }
        return transitionCosts;
    }

    @Override
    public String toString() {
        return "[MaestroPayment" +
                ", CardNumber='" + cardNumber + '\'' +
                ", Amount='" + getAmount() + '\'' +
                ", Currency='" + getCurrency() + '\'' +
                ", TransactionCosts='" + calcTransactionCosts() + '\'' +
                ']';
    }
}

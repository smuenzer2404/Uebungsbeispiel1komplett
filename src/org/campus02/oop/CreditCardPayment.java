package org.campus02.oop;

public class CreditCardPayment extends Payment {

    private String cardNumber;
    private String securityNumber;

    public double calcTransactionCosts() {
        if (getCurrency() != "EUR") {
            return 1.5 + exchangeToEUR() * 0.275;

        } else {
            return 0.5 + exchangeToEUR() * 0.011;

        }
    }

    public CreditCardPayment(double amount, String currency, String cardNumber, String securityNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.securityNumber = securityNumber;
    }

    @Override
    public String toString() {
        return "[CreditCardPayment," +
                "CardNumber='" + cardNumber + '\'' +
                ", SecurityNumber='" + securityNumber + '\'' +
                ", Amount='" + getAmount() + '\'' +
                ", Currency='" + getCurrency() + '\'' +
                ", TransactionCosts ='" + calcTransactionCosts() + "]";
    }
}

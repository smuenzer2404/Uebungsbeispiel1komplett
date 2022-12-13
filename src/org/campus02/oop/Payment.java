package org.campus02.oop;

public abstract class  Payment {
    private double amount;
    private String currency;

    public abstract double calcTransactionCosts();


    public double exchangeToEUR (){
        //double calculatedAmount = 0.0;
        switch (currency){
            case "USD": return amount/ 1.1;
            case "GBP": return amount/0.85;
            case "SEK": return amount/9.5;
            case "HUF": return amount/310;
            default: return amount/2;
        }
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;

    }
}

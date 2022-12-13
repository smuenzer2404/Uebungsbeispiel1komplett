package org.campus02.oop;

import javax.swing.text.MaskFormatter;

public class DemoApp {
    public static void main(String[] args) {

        PaymentJournal pj = new PaymentJournal();

        CashPayment cp = new CashPayment(500, "USD");
        CashPayment cp2 = new CashPayment(200, "GBP", "Sandra");

        MaestroPayment mp = new MaestroPayment(430.80, "SEK", "528 345 678");
        MaestroPayment mp2 = new MaestroPayment(10, "EUR", "528 345 678");

        CreditCardPayment ccp = new CreditCardPayment(350.70, "HUF", "AT1234","123");
        CreditCardPayment ccp3 = new CreditCardPayment(350.70, "HUF", "AT1234","123");
        CreditCardPayment ccp2 = new CreditCardPayment(70, "XXX", "12345x" , "456");

        pj.add(cp);
        pj.add(cp2);
        pj.add(ccp);
        pj.add(ccp2);
        pj.add(mp);
        pj.add(mp2);
        pj.add(ccp3);

        System.out.println(mp);
        System.out.println(cp);
        System.out.println(ccp);

        System.out.println(pj.totalTransactionCosts());
        System.out.println(pj.getPaymentsPerCurrency());

        System.out.println(mp2);







    }
}

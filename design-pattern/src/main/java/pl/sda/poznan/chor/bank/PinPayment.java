package pl.sda.poznan.chor.bank;

import java.util.Scanner;

public class PinPayment extends Payment {

    private final Double MAX_PAYMENT = 500d;

    public PinPayment(Account account) {
        super(account);
    }

    @Override
    protected Double getMaxAmount() {
        return MAX_PAYMENT;
    }

    @Override
    protected boolean handlePayment(Double amount) {
        System.out.println("Your pin: ");
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        return account.pay(amount, v);
    }
}

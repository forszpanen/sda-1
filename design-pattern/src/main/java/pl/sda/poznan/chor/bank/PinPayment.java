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
        int pinFromUser = sc.nextInt();
        return account.pay(amount, pinFromUser);
    }
}

package pl.sda.poznan.chor.bank;

import java.util.Scanner;

public class TwoFactorPayment extends Payment {
    private static final Double MAX_AMOUNT = 5000d;

    public TwoFactorPayment(Account account) {
        super(account);
    }

    @Override
    protected Double getMaxAmount() {
        return MAX_AMOUNT;
    }

    @Override
    protected boolean handlePayment(Double amount) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your pin: ");
        int pin = sc.nextInt();
        if (account.validate(pin)) {
            System.out.println("Your verification token");
            int token = sc.nextInt();
            return account.pay(amount, pin, token);
        }
        return false;
    }
}

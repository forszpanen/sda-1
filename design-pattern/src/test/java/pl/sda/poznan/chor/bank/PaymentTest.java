package pl.sda.poznan.chor.bank;

import org.junit.Test;

public class PaymentTest {
    @Test
    public void test() {
        Account account = new Account(8000d, 9876, 123456);

        Payment paypass = new PaypassPayment(account);
        Payment pinPayment = new PinPayment(account);
        Payment twoFactorPayment = new TwoFactorPayment(account);

//        paypass.setNextPayment(pinPayment);
//        pinPayment.setNextPayment(twoFactorPayment);

//        paypass.processPayment(30d);
//        paypass.processPayment(300d);
//        System.out.println(paypass.processPayment(3000d));

    }
}
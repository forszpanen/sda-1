package pl.sda.poznan.chor.bank;

public class Program {
    public static void main(String[] args) {
        Account account = new Account(8000d, 9876, 12345);

        Payment paypass = new PaypassPayment(account);
        Payment pinPayment = new PinPayment(account);
        Payment twoFactorPayment = new TwoFactorPayment(account);

        paypass.setNextPayment(pinPayment);
        pinPayment.setNextPayment(twoFactorPayment);

//        paypass.processPayment(30d);
//        boolean b = paypass.processPayment(300d);
//        System.out.println(b);
        boolean b1 = paypass.processPayment(3000d);
        System.out.println(b1);
    }
}

package pl.sda.poznan.chor.bank;

public class PaypassPayment extends Payment {

    private final Double MAX_AMOUNT = 50d;

    public PaypassPayment(Account account) {
        super(account);
    }

    @Override
    protected Double getMaxAmount() {
        return MAX_AMOUNT;
    }

    @Override
    protected boolean handlePayment(Double amount) {
        System.out.println("Handling payment without pin...");
        return account.pay(amount);
    }
}

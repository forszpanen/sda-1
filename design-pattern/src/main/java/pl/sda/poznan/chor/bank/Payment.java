package pl.sda.poznan.chor.bank;

import lombok.RequiredArgsConstructor;


//@NoArgsConstructor //Ta adnotacja jest niedozwolona (spowoduje błąd komilacji), bo mamy pole oznaczone jako final -> mogło by zostać nie zainicjalowane
@RequiredArgsConstructor //tworzy konstuktor dla wszystkich pol oznaczonych jako final
public abstract class Payment {

    protected final Account account;

    protected Payment nextPayment;


//    protected Payment(Account account){  //taki konstruktor wygeneruje adnotacja @RequiredArgsConstructor
//        this.account = account;
//    }

    protected abstract Double getMaxAmount();

    public void setNextPayment(Payment nextPayment) {
        this.nextPayment = nextPayment;
    }

    public boolean processPayment(Double amount) {
        if (amount < getMaxAmount()) {
            return this.handlePayment(amount);
        } else if (nextPayment != null) {
            return nextPayment.handlePayment(amount);
        }
        return false;
    }

    protected abstract boolean handlePayment(Double amount);
}

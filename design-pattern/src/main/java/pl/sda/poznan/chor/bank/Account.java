package pl.sda.poznan.chor.bank;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@RequiredArgsConstructor
public class Account {

    @Getter
    private Double balance;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String ownerName;

    private final int pin;

    public boolean pay(Double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    public boolean pay(Double amount, int pin) {
        if (validate(pin)) {
            return pay(amount);
        }
        return false;
    }

    private boolean validate(int pin) {
        return Objects.equals(this.pin, pin);
    }
}

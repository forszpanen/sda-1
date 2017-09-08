package pl.sda.poznan.chor.bank;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class Account {

    public static final int PIN_LENGTH = 4;

    @Getter
    private Double balance = 0d;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String ownerName;

    private final int pin;
    private final int token;

    public Account(Double balance, int pin, int token) {
        this.balance = balance;
        this.pin = pin;
        this.token = token;
    }

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

    public boolean validate(int pin) {
        if (Integer.toString(pin).length() == PIN_LENGTH) {
            return this.pin == pin;
        }

        return false;
    }

    public boolean pay(Double amount, int pin, int token) {
        if (Integer.toString(token).length() == 6) {
            return pay(amount);
        }
        return false;
    }
}

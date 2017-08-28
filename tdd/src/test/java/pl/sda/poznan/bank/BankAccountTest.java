package pl.sda.poznan.bank;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    @Test
    public void deposit() throws Exception {
        //Arrange
        BankAccount bankAccount = new BankAccount("Jan", "Nowak", 1000);

        //Act
        double deposit = bankAccount.deposit(200);

        //Assert
        assertEquals(200, 200, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void deposit_minus_amount(){
        BankAccount bankAccount = new BankAccount("Jan", "Kowalski", 1000);
        bankAccount.deposit(-500);

    }

}
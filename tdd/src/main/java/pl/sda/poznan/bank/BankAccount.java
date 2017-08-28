package pl.sda.poznan.bank;

public class BankAccount {
    //imie
    private String firstName;
    //nazwisko
    private String surname;
    //saldo
    private double balance;

    //Konstruktor przyjmujacy wszystkie pola
    public BankAccount(String firstName, String surname, double balance) {
        this.firstName = firstName;
        this.surname = surname;
        this.balance = balance;
    }

    //gettery i settery
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getBalance() {
        return balance;
    }

    //metoda do wplaty srodkow
    public double deposit(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Amount has to be greater than 0");
        }
        this.balance += amount;
        return this.balance;
    }
}

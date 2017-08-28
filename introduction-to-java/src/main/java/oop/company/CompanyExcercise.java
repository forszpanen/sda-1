package oop.company;

import java.util.Scanner;

public class CompanyExcercise {
    //1
    private Scanner scanner;
    private Company myCompany;

    public CompanyExcercise() {
        this.myCompany = new Company();
        //2
        scanner = new Scanner(System.in);
    }

    public void start() {
        boolean exit = false;


        while (exit == false) {


            System.out.println("Wybierz opcje: ");
            System.out.println("1. Dodaj nowego pracownika");
            System.out.println("2. Usun pracownika");
            System.out.println("3. Wypisz pracownikow");
            System.out.println("0. Wyjdz z programu");
            int option = scanner.nextInt();


            switch (option) {
                case 1: {
                    addEmployeeToMyCompany(); // lokalna metoda
                    break;
                }
                case 2: {
                    deleteEmployeeFromMyCompany();
                    break;
                }
                case 3: {
                    printAllEmployees();
                    break;
                }
                case 0: {
                    exit = true;
                    break;
                }
                default: {
                    System.out.println("Nie ma takiej opcji - podaj jeszcze raz");
                    break;
                }
            }
        }

    }

    //Metoda "lokalna", "z maina", ktora sluzy do skrocenia switcha
    public void addEmployeeToMyCompany() {
        Employee nextEmp = new Employee();
        System.out.println("Podaj imie");
        nextEmp.setName(scanner.next());

        System.out.println("Podaj nazwisko: ");
        nextEmp.setSurname(scanner.next());

        System.out.println("Podaj wiek: ");
        nextEmp.setAge(scanner.nextInt());

        System.out.println("Podaj pensje");
        nextEmp.setSalary(scanner.nextDouble());

        //metoda wywolana na obiekcie myCompany, gdzie myCompany to pole prywatne klasy ("naszego maina")
        myCompany.addEmployee(nextEmp);
    }

    public void deleteEmployeeFromMyCompany() {
        // logika usuwania pracownika
    }

    //Metoda uzywa petli foreach i powoduje NullPointerException, gdy pracownikow jest mniej niz maksymalna liczba
    public void printAllEmployeesBad() {
        //logika wyswietlania pracownikow
        myCompany.printEmployeesBad();

    }

    public void printAllEmployees(){
        myCompany.printEmployees();
    }

}

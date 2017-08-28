package oop.company;

public class Employee {

    private String name;
    private String surname;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String s) {
        this.surname = s;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if (a > 0) {
            this.age = a;
        } else {
            System.out.println("Wiek nie moze byc ujemny");
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Pensja nie moze byc mniejsza od zero");
        } else {
            this.salary = salary;
        }
    }

    public void describeEmployee(){
        System.out.println("Name: " + this.name + " Surname: " + this.surname + " Age: " + this.age);
    }
}

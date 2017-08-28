package oop.overloading;


public class Author {
    private String name;
    private String surname;
    private int age;

    public Author(int age) {
        //1
        this.age = age;
    }

    public Author(String name, String surname) {
        //2
        this.name = name;
        this.surname = surname;
    }

    public Author(String name, String surname, int age) {
        //3
        this(name, surname);
        this.age = age;
        System.out.println(this.getName().length());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

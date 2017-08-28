package oop.overloading;

/**
 * Created by RENT on 2017-07-19.
 */
public class Student {
    private String name;
    private String surname;
    private int age;
    private int yearOfStudies;
    private int indexNumber;

    //Kazdy z przeciazonych konstruktorow posiada inna sygnature - wiec mozemy miec kilka konstruktorow w Klasie
    public Student(){
        //1
        System.out.println("Bezparametrowy");
    }

    public Student(int age){
        //2
        this.age = age;
    }

    public Student(String name){
        //3
        this.name = name;
    }

    public Student(int age, String surname){
        this.surname = surname;
    }

    public Student(String surname, int age){
        this.surname = surname;
    }

    public Student(String name, String surname){
        //4
        System.out.println("Tworze studenta z uzyciem konstruktora przeciazonego");
        this.name = name;
        this.surname = surname;
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

    public int getYearOfStudies() {
        return yearOfStudies;
    }

    public void setYearOfStudies(int yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }
}

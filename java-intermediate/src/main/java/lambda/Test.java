package lambda;

import generic.Person;

public class Test {

    // () ->  System.out.println("Hello");
    void doSth(){
        System.out.println("Hello");
    }

    //imie ->  System.out.println(imie);
    void printName(String name){
        System.out.println(name);
    }

    // n -> 3 * n;
    int tripleNumber(int n){
        return 3 * n;
    }

    //(a, b) -> a + b;
    int addTwoNumbers(int a, int b){
        return a + b;
    }



    //funkcja zwraca czy pierwszy parametr jest wiekszy niz drugi
    //(a, b) -> a > b
    boolean checkIfFirstParameterIsGreaterThanSecond(int a, int b){
        return a > b;
    }

    //p -> p.getAge() > 18;
    boolean checkIfAgeIsGreaterThan18(Person p){
        return p.getAge() > 18;
    }









}

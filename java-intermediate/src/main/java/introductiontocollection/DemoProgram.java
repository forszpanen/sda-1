package introductiontocollection;

import generic.CustomStack;
import generic.Person;

import java.util.*;

public class DemoProgram {
    public static void main(String[] args) {

        CustomStack<Person> myStack = new CustomStack<>(Person.class, 5);
        myStack.push(new Person("Jan", "Kowalski"));
        myStack.push(new Person("Szymon", "Nowak"));
        myStack.push(new Person("Szymon", "Nowak"));
        myStack.push(new Person("Szymon", "Nowak"));

        Person pop = myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.pop();

        Stack<Person> stack = new Stack<>();
        Person pop1 = stack.pop();



//        List<Person> people = new ArrayList<>();
//
//        for (Person p : people) {
//            p.getName();
//        }
//
//
//        List mojaLista = new ArrayList();
//        mojaLista.add(new Object());
//        mojaLista.add("String");
//        mojaLista.add(5);
//
//
////        mojaLista.add(new Rectange());
//
//        for (Object o : mojaLista) {
//            String s = (String) o;
//        }
//
//
//        List<String> napisy = new ArrayList<>();
//        Stack<String> stos = new Stack<>();
//
//
//        //Dodawanie do listy
//        napisy.add("Zenek");
//        napisy.add("Marek");
//        napisy.add("Janek");
//        napisy.add("Adam");
//
//        //Usuwanie na okreslonej pozycji - liczymy od 0
//        napisy.remove(1);
//        napisy.remove("TESTNAPISU");
//        napisy.removeIf(p -> p.length() > 5);
//
//        //Czysci cala liste
//        napisy.clear();
//
//        //Pobiera dlugosc listy
//        napisy.size();
//
//        napisy.forEach(p -> System.out.println(p));
//        //
////        napisy.sort((c1, c2 ) -> c1.compareTo(c2));

    }
}

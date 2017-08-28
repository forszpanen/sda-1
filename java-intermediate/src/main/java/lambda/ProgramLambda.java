package lambda;

import generic.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProgramLambda {
    public static void main(String[] args) {
        SimpleInterface si = () -> System.out.println("Hello");

        si.doSth();

        PrintNameInterface pni = imie -> System.out.println(imie);
        pni.printName("Piotr");


        TripleNumberInterface tni = x -> 3 * x;

        int i = tni.tripleNumber(3);

        SimplePredicate sp = person -> person.getAge() > 18;
        sp.checkIfPersonIsAdult(new Person("Jan", "Kowalski", 20));


        //Nowa mapa
        Map<String, Integer>  map = new HashMap<>();
        //lista osob
        List<Person> list = new ArrayList<>();

        //lista osob starszych niz 18 lat
        List<Person> maturePeople = list.stream().filter(p -> p.getAge() > 18).collect(Collectors.toList());

        for (Person per : maturePeople){
            map.put(per.getName(), per.getAge());
        }
        //Jan -> 40
        //Adam -> 23


    }
}

package generic;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsPlayground {


    public static void foo(List<Person> people, Workable workable){

        for (Person person : people){
            if(workable.canWork(person)){
                System.out.println("Ta osoba moze pracowac");
            }
        }
    }


    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Nowak", 20));
        people.add(new Person("Janusz", "Nowacki", 15));
        people.add(new Person("Mirek", "Adamiak", 12));

//        boolean canWork(Person p)


//        @Override
//        public boolean canWork(Person p) {
//            return p.getAge() > 18;
//        }
//
        foo(people, new WorkableImplementation());
        foo(people, p -> {
            return p.getAge() > 18;
        } );











//        List<Person> people = new ArrayList<>();
//
//        people.add(new Person("Jan", "Nowak", 20));
//        people.add(new Person("Janusz", "Nowacki", 15));
//        people.add(new Person("Mirek", "Adamiak", 12));


        List<String> strings = new ArrayList<>();
        strings.add("adkjsajdsajdlksad");
        strings.add("zzz");

        Collections.sort(strings, new StringLengthComparator());



        System.out.println("posortowane");
    }

}

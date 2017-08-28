import fileanddirectory.FileOverviewRefactor;
import generic.Person;
import generic.PersonStack;
import generic.Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    private static final String PATH_TO_FILE ="C:\\Users\\RENT\\IdeaProjects\\hello\\src\\plik.txt";

    public static void main(String[] args) throws InterruptedException, IOException {

        List<Person> personList = new ArrayList<>();

        List<String>  s =new Vector<>();

        Map<String, Integer> stringIntegerMap;

        Collections.sort(personList);


//        PersonStack<Person> personPersonStack = new PersonStack<>();
//
//        PersonStack<Student> studentPersonStack = new PersonStack<>();
//
//        PersonStack<Object>  objectPersonStack = new PersonStack<Object>();




        System.out.println("zaczynam czytac");
        String line = null;
        int nr_linii = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader("plik.txt"))){

            while ((line = reader.readLine())!= null){
                System.out.println(++nr_linii + ": " + line);

            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

    }
}

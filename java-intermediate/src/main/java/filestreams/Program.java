package filestreams;

import pl.sda.poznan.commons.model.Employee;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Program {
    public static void main(String[] args) throws Exception {

        ObjectOutputStream outputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get("plik2.txt")));

        outputStream.writeObject(new Employee("Piotr", "Kowalski", 23, 2500));


        ObjectInputStream inputStream = new ObjectInputStream(Files.newInputStream(Paths.get("plik2.txt")));

        Object o = inputStream.readObject();


        System.out.println(o.toString());
    }
}

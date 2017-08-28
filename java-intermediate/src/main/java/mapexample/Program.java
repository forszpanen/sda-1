package mapexample;

//Napisać program, ktory zlicza ilosc wystapien danego slowa w pliku.
//I wyswietla 10 najczesciej wystepujacych slow

import java.util.HashMap;
import java.util.Map;

//odczytac plik slowa.txt
//rozdzielic linijki tekstu na oddzielne slowa
//Utworzyc slownik przechowujacy slowa i ich wystapienia
//Jezeli slowo jest w slowniku -> zwiekszyc ilosc
//Jezeli slowa nie ma w slowniku -> dodac nowy klucz
public class Program {

    public static void main(String[] args) {

        WordsCounter wc = new WordsCounter();
        Map<String, Integer> stringIntegerMap = wc.countWords();

        //przejdz przez zbior wszystkich kluczy
        //dla kazdego klucza wypisz ten klucz i jego wartosc
        for(String key : stringIntegerMap.keySet()){
            System.out.println("Slowo: " + key + " wystapilo: " + stringIntegerMap.get(key) + " razy");
        }


    }
}

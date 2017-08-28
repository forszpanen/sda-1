package mapexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WordsCounter {

    private static final String PATH_TO_FILE = "slowa.txt";

    //metoda odczytujaca plik
    //w kazdym elemencie listy bedzie linijka tekstu
    public List<String> getAllLinesFromFile() {
        List<String> linesFromFile = null;
        try {
            linesFromFile = Files.readAllLines(Paths.get(PATH_TO_FILE));
        } catch (IOException ex) {
            System.out.println("Zla nazwa pliku");
            ex.printStackTrace();
        }
        return linesFromFile;
    }

    //Metoda, ktora rozdziela linie tekstu do pojedynczych slow
    public List<String> getAllWords() {
        //pobierz wszystkie linijki z pliku
        List<String> lines = getAllLinesFromFile();
        List<String> pojedynczeSlowaListaWynikowa = new ArrayList<>();

        //dla kazdej linijki wykonuj:
        for (String line : lines) {
            //Lorem Ipsum jest tekstem stosowanym,  jako przykładowy wypełniacz.
            //Lorem
            //Ipsum
            //jest
            //tekstem
            // ...

            //metoda replace(",", "") -> zamieni przecinki na pusty napis (bez spacji)
            //metoda replace(".", "") -> zamieni kropki na pusty napis
            //pojedyczne slowa beda dopiero po wywolaniu metody split
            String[] pojedynczeSlowazLinijki = line
                    .replace(",", "")
                    .replace(".", "")
                    .split(" ");

            //Dopisz pojedyncze slowa do wynikowej listy
            //kolejny for do przejscia tablicy stringow
//            for(String slowo : pojedynczeSlowazLinijki){
//                pojedynczeSlowaListaWynikowa.add(slowo);
//            }
            //ALBO
            pojedynczeSlowaListaWynikowa.addAll(Arrays.asList(pojedynczeSlowazLinijki));

        }
        return pojedynczeSlowaListaWynikowa;

    }

    //Metoda zliczajaca slowa z uzyciem mapy
    public Map<String, Integer> countWords() {
        //Utworz nowa mape z typem String jako klucz, i Integer jako wartosc
        Map<String, Integer> mapOfWords = new HashMap<>();
        List<String> allWords = getAllWords();

        //Dla kazdego slowa wykonuj
        for (String slowo : allWords) {
            //jezeli w mapie jest taki klucz
            if (mapOfWords.containsKey(slowo)) {

                //pobierz wartosc z mapy po kluczu
                Integer value = mapOfWords.get(slowo);
                //zwieksz wartosc
                value++;
                //wstaw nowa wartosc do mapy
                mapOfWords.put(slowo, value);
            } else {
                //jezeli nie ma slowa w slowniku
                //to wstaw nowy klucz z wartoscia 1
                //poniewaz jest to pierwsze wystapienie dla tego slowa
                mapOfWords.put(slowo, 1);
            }
        }
        //zwroc gotowa mape
        return mapOfWords;
    }

}

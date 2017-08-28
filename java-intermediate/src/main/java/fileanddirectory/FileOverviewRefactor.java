package fileanddirectory;

import java.io.*;
import java.util.Scanner;

public class FileOverviewRefactor {

    //publiczna metoda wykonujaca utworzenie katalogu
    //utworzenie pliku
    //zapis do pliku
    public static void createDirectoryAndFile() throws IOException {
        String directoryName = getDirectoryName();
        makeDirectory(directoryName);
        saveNoteToFile(directoryName, getNote());
    }

    //pomocnicza metoda, tworzaca katalog
    private static String getDirectoryName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe katalogu");
        String directoryName = scanner.nextLine();
        return directoryName;
    }

    private static String getNote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj notatke");
        String note = scanner.nextLine();
        return note;
    }

    private static void saveNoteToFile(String directoryName, String note) {
        Scanner sc = new Scanner(System.in);
        boolean append = false;
        File myFile = new File(directoryName);
        if(myFile.exists()){
            System.out.println("Plik istnieje. Czy chcesz do niego dopisac? Wpisz true lub false");
            append = sc.nextBoolean();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(directoryName + "\\plik.txt", append))) {
            bufferedWriter.write(note);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void makeDirectory(String directoryName) throws IOException {
        File file = new File(directoryName);

        if (file.exists()) {
            System.out.println("Katalog istnieje");
        } else {

            //Metoda mkdir - tworzy nowy katalog i zwraca wynik tej operacji-> true jesli sie udalo, false w przeciwnym przypadku
            if (file.mkdir()) {
                System.out.println("Utworzono katalog");
            } else {
                System.out.println("Nie udalo sie utworzyc katalogu");
            }
            // To samo z uzyciem operatora trojargumentowego
            //            System.out.println(file.mkdir() ? "Utworzono katalog" : "Nie udalo sie");

        }
    }


}

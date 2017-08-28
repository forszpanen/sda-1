package quizgame;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){

        String test = "Ala ma kota";
        byte[] bytes = test.getBytes();
        char a = 65;


        //Podaj nick
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        while (option != 0) {
            System.out.println();
            System.out.println("QUIZ");
            System.out.println("1. Nowy quiz");
            System.out.println("2. Lista wynikow");
            System.out.println("0. Wyjscie");
            option = scanner.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("NOWY QUIZ");
                    Quiz quiz = new Quiz();
                    List<Question> questions = quiz.readAllQuestions();
                    //Zapytac o nick
                    System.out.println("Podaj swoj nick");
                    String username = scanner.next();
                    int liczbaPrawidlowychOdpowiedzi = 0;

                    for (int i = 0; i < questions.size(); i++) {
                        //wyswietlic numer pytania
                        System.out.println("Pytanie nr: " + (i + 1));
                        Question que = questions.get(i);
                        //wyswietlic pytanie
                        System.out.println(que);
                        //wczytac odpowiedz od uzytkownika
                        String odpowiedzUzytkownika = scanner.next();
                        //sprawdzic czy wczytana odpowiedz jest prawidlowa
                        if (que.getCorrectAnswer().equals(odpowiedzUzytkownika)) {
                            System.out.println("Prawidlowa odpowiedz");
                            //zwiekszyc licznik prawidlowych odpowiedzi
                            liczbaPrawidlowychOdpowiedzi++;
                        } else {
                            System.out.println("Blad!");
                        }
                    }
                    // po skonczonym quizie wyswietlic podsumowanie
                    System.out.println("Twoj wynik to: " + liczbaPrawidlowychOdpowiedzi + "/" + questions.size());
                    System.out.println();
                    //dopisac wynik do pliku wyniki.txt
                    String wynik = username + " " + liczbaPrawidlowychOdpowiedzi;


                    Path p = Paths.get("wyniki.txt");
                    try {
//                        Files.write(p, wynik.getBytes(), Files.exists(p) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                        //zapisuje do pliku, ale kasuje poprzednia zawartosc
//                        Files.write(p, wynik.getBytes());

                        //Dopisuje do pliku, ale rzuca wyjatek, jezeli pliku nie ma
                        // mozna probowac w bloku try-catch, ale jest to rozwiazanie
                        //nie ladne
//                        Files.write(p, wynik.getBytes(), StandardOpenOption.APPEND);

                        //Najlepsze rozwiazanie
                        //Sprawdzamy z uzyciem operatora trojargumentowego
                        //czy plik istnieje
                        //Jezeli tak (wykona sie kod po znaku ? ) -> wybrana bedzie opcja APPEND
                        //jezeli nie wykona sie kod po : -> wybrana bedzie opcja CREATE

                        Files.write(p, wynik.getBytes(), Files.exists(p) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);

                    } catch (IOException e) {
                        System.out.println("Nie mozna zapisac wyniku do pliku");
                    }
                    break;
                }
                case 2: {
                    System.out.println("NAJWYZSZE WYNIKI");
                    List<String> ranking = Quiz.getRanking();
                    if (ranking != null) {
                        for (String wynik : ranking) {
                            System.out.println(wynik);
                        }
                    } else {
                        System.out.println("Brak wynikow");
                    }

                    break;
                }
                case 0: {
                    System.out.println("Wychodze z programu");
                    break;
                }
            }
        }


    }
}

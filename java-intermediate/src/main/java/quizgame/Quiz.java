package quizgame;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Quiz {

    //sciezka do pliku z wynikami
    private static final String PATH_TO_RESULTS = "wyniki.txt";

    //sciezka do pliku z pytaniami
    public static final String PATH_TO_QUESTIONS = "pytania.txt";


    //Odczyt rankingu z pliku z zwrocenie go jako liste Stringow
    public static List<String> getRanking() {
        List<String> result = null;
        try {
            //Linijki z pliku przypisac do zmiennej typu List<String>
            result = Files.readAllLines(Paths.get(PATH_TO_RESULTS));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    //Odczytuje z pliku pytania
    //Przerabia surowe napisy na Obiekty typu Question
    //przyjmujemy, ze pytanie zajmuje 6 linii w pliku
    public List<Question> readAllQuestions() {
        //1. Odczytac wszystkie linie z pliku
        List<String> questionsFromFile = null;
        List<Question> questionList = new ArrayList<>();

        //Odczytujemy plik i dostajemy surowe napisy
        try {
            questionsFromFile = Files.readAllLines(Paths.get(PATH_TO_QUESTIONS));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //2. Zmapowac pytanie na obiekt typu Question
        //Przechodzimy przez liste napisow i tworzymy obiekt pytania
        for (int i = 0; i < questionsFromFile.size(); i += 6) {
            Question question = new Question();
            question.setTitle(questionsFromFile.get(i));
            question.getAnswers().add(questionsFromFile.get(i + 1));
            question.getAnswers().add(questionsFromFile.get(i + 2));
            question.getAnswers().add(questionsFromFile.get(i + 3));
            question.getAnswers().add(questionsFromFile.get(i + 4));
            question.setCorrectAnswer(questionsFromFile.get(i + 5));
            //dodajemy pytanie do listy
            questionList.add(question);
        }


        return questionList;
    }

}
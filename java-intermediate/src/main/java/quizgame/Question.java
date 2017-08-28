package quizgame;

import java.util.ArrayList;
import java.util.List;
//Klasa modelujaca pytanie - zawiera pola do zapisania tytulu, odpowiedzi i prawidlowej odpowiedzi

public class Question {
    private String title;
    private List<String> answers = new ArrayList<>();
    private String correctAnswer;

    public Question() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n");
        for (String a : answers) {
            sb.append(a).append("\n");
        }
        return sb.toString();
    }
}

package dev.shroysha.ap.chapterproblems.chapter3;

import lombok.Getter;

/**
 * A student who is taking quizzes.
 */
public class Student {

    @Getter
    private final String name;
    private int numberOfQuizzes;
    @Getter
    private double totalScore;

    public Student(String n) {
        name = n;
        numberOfQuizzes = 0;
        totalScore = 0;
    }


    public void addQuiz(int score) {
        totalScore += score;
        numberOfQuizzes++;
    }

    public double computeAverageScore() {
        return totalScore / numberOfQuizzes;
    }

}

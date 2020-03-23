package dev.shroysha.ap.chapterproblems.chapter3;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student("Cola, Carla");

        student.addQuiz(93);
        student.addQuiz(107);

        System.out.println(student.getName());
        System.out.println("Expected: Cola, Carla");

        System.out.println(student.getTotalScore());
        System.out.println("Expected: 200");

        System.out.println(student.computeAverageScore());
        System.out.println("Expected: 100");
    }

}



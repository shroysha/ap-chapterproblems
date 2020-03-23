package dev.shroysha.ap.chapterproblems.chapter5;

import java.util.Scanner;

public class GradeTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a letter grade:");
        String input = in.nextLine();

        Grade g = new Grade(input);
        double grade = g.getNumericGrade();
        System.out.println("Numeric value: " + grade);
    }
}

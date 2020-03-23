package dev.shroysha.ap.chapterproblems.chapter6;

import java.util.Scanner;

public class RootApproximateTest {
    public static void main(String[] args) {
        double a = 100;
        final double EPSILON = 1;

        RootApproximate approx = new RootApproximate(a, EPSILON);

        System.out.println(approx.nextGuess());
        System.out.println("Expected: 1");
        System.out.println(approx.nextGuess());
        System.out.println("Expected: 50.5");
        while (approx.hasMoreGuesses()) {
            approx.nextGuess();
        }

        System.out.println(Math.abs(approx.nextGuess() - 10) < EPSILON);
        System.out.println("Expected: true");
    }

    public void test2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number that you want a square root of: ");
        double a = in.nextDouble();
        final double EPSILON = 1E-12;

        RootApproximate r = new RootApproximate(a, EPSILON);

        while (r.hasMoreGuesses()) {
            System.out.println(r.nextGuess());
        }
    }
}

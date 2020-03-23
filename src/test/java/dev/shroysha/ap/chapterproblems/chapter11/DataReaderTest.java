package dev.shroysha.ap.chapterproblems.chapter11;

import java.util.Scanner;

public class DataReaderTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;
        int errors = 0;
        int sum = 0;

        while (running) {
            try {
                System.out.print("Value: ");
                sum += Integer.parseInt(in.nextLine());
                errors = 0;
            } catch (NumberFormatException ex) {
                System.out.println("Input error. Try again.");
                errors++;
            }

            if (errors == 2) {
                running = false;
            }
        }

        System.out.println("Sum: " + sum);
    }
}

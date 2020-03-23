package dev.shroysha.ap.chapterproblems.chapter6;

import java.util.Scanner;

public class HighestTemperatureTest {

    public static final int NUMBER_OF_MONTHS = 12;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter twelve temperature values: ");

        int highestMonth = 0;
        double highestTemperature = Double.MIN_VALUE, current;
        for (int i = 1; i < NUMBER_OF_MONTHS + 1; i++) {
            current = Double.parseDouble(in.next());

            if (highestTemperature <= current) {
                highestTemperature = current;
                highestMonth = i;
            }
        }

        System.out.println("Highest Month: " + highestMonth);
        System.out.println("Highest Temperature: " + highestTemperature);
    }

}

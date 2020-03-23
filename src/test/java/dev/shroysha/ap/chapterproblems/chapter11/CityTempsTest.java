package dev.shroysha.ap.chapterproblems.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CityTempsTest {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("celsius.txt");
        File outputFile = new File("fahrenheit.txt");

        Scanner in = new Scanner(inputFile);
        try (PrintWriter out = new PrintWriter(outputFile)) {
            while (in.hasNextDouble()) {
                String month = in.next();
                double temp = in.nextDouble();
                // Write each line to the output file with the temperature in Fahrenheit
                out.println(month + toFahrenheit(temp));
            }
        }

    }

    public static double toFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32.0;
    }

}

package dev.shroysha.ap.chapterproblems.chapter11;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Arithmetic {

    public static final char[] operators = {'+', '-', '*'};

    public static ArrayList<Integer> read(String filename) throws IOException {
        Scanner in = new Scanner(new File(filename));
        ArrayList<Integer> solutions = new ArrayList<>();

        while (in.hasNextLine()) {
            String line = in.nextLine();
            int index;

            if ((index = line.indexOf(operators[0])) != -1) {
                int num1 = Integer.parseInt(line.substring(0, index));
                int num2 = Integer.parseInt(line.substring(index + 1));
                solutions.add(num1 + num2);
            } else if ((index = line.indexOf(operators[1])) != -1) {
                int num1 = Integer.parseInt(line.substring(0, index));
                int num2 = Integer.parseInt(line.substring(index + 1));
                solutions.add(num1 - num2);
            } else if ((index = line.indexOf(operators[2])) != -1) {
                int num1 = Integer.parseInt(line.substring(0, index));
                int num2 = Integer.parseInt(line.substring(index + 1));
                solutions.add(num1 * num2);
            } else {
                throw new UnsupportedOperationException("");
            }
        }
        return solutions;
    }

    /**
     * This method checks your work
     */
    public static String check(String filename) {
        try {
            return read(filename).toString();
        } catch (IOException ex) {
            return "I/O exception thrown";
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

}


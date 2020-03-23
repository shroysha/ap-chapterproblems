package dev.shroysha.ap.chapterproblems.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindInFileTest {

    public static void main(String[] args) throws FileNotFoundException {
        if (args.length < 2) {
            System.out.println("Usage: Find keyword sourcefile1 sourcefile2 . . .");
            return;
        }

        String keyword = args[0];
        for (int i = 1; i < args.length; i++) {
            String filename = args[i];
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println(filename + ": " + line);
                }
            }
        }
    }

}

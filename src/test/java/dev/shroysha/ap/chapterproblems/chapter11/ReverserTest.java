package dev.shroysha.ap.chapterproblems.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class ReverserTest {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: Reverser keyword sourcefile");
            return;
        }
        try {
            File file = new File(args[0]);
            Scanner fromFile = new Scanner(file);
            StringBuilder finalWrite = new StringBuilder();

            while (fromFile.hasNextLine()) {
                String line = fromFile.nextLine();
                for (int i = line.length() - 1; i >= 0; i++) {
                    finalWrite.append(line.charAt(i));
                }
                finalWrite.append("\n");
            }

            PrintStream out = new PrintStream(file);
            out.print(finalWrite);
        } catch (FileNotFoundException e) {
            System.err.println("The file you specified could not be found.");
        }
    }

}

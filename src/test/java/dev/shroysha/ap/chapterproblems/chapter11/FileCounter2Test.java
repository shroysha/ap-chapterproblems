package dev.shroysha.ap.chapterproblems.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileCounter2Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FileCounter2 counter = new FileCounter2();
        boolean done = false;
        while (!done) {
            try {
                System.out.println("Enter the file name: ");
                String input = in.nextLine();
                File file = new File(input);
                Scanner scanner = new Scanner(file);
                counter.read(scanner);
            } catch (FileNotFoundException e) {
                done = true;
            }
        }
        System.out.println("Characters: " + counter.getCharCount());
        System.out.println("Words: " + counter.getWordCount());
        System.out.println("Lines: " + counter.getLineCount());
    }

}

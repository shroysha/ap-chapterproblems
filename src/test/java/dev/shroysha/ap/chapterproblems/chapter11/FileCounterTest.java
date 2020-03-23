package dev.shroysha.ap.chapterproblems.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileCounterTest {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        System.out.println("File name:  ");
        String fileName = in.nextLine();

        FileCounter counter = new FileCounter();
        Scanner fileIn = new Scanner(new File(fileName));
        counter.read(fileIn);

        System.out.println("Characters: " + counter.getCharCount());
        System.out.println("Words: " + counter.getWordCount());
        System.out.println("Lines: " + counter.getLineCount());

        fileIn.close();
    }
}

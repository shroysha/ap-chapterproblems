package dev.shroysha.ap.chapterproblems.chapter11;

import lombok.Getter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileCounter {

    @Getter
    private int lineCount, charCount, wordCount;

    /**
     * Construct a FileCounter object.
     */
    public FileCounter() {
        lineCount = 0;
        charCount = 0;
        wordCount = 0;
    }




    public void read(Scanner in) {
        while (in.hasNextLine()) {
            lineCount++;
            String line = in.nextLine();
            wordCount += new StringTokenizer(line, " ").countTokens();
            charCount += line.length() + 1;
        }
    }

}

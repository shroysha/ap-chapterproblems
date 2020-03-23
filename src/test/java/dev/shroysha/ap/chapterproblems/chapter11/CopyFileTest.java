package dev.shroysha.ap.chapterproblems.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFileTest {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: CopyFile sourcefile targetfile");
            return;
        }
        String sourceText = args[0];
        String outText = args[1];

        try {
            Scanner in = new Scanner(new File(sourceText));
            PrintWriter out = new PrintWriter(new File(outText));
            while (in.hasNextLine()) {
                out.println(in.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("One of the files you specified could not be found");
        }
    }
}

package dev.shroysha.ap.chapterproblems.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BabyNamesTest {

    public static final double LIMIT = 50;

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Enter the file where the baby name data is located at: ");
        Scanner in = new Scanner(new File(new Scanner(System.in).nextLine()));

        RecordReader boys = new RecordReader(LIMIT);
        RecordReader girls = new RecordReader(LIMIT);

        while (boys.hasMore() || girls.hasMore()) {
            int rank = in.nextInt();
            System.out.print(rank + " ");
            boys.process(in);
            girls.process(in);
            System.out.println();
        }

        in.close();
    }

}


package dev.shroysha.ap.chapterproblems.chapter4;

import java.util.Scanner;

public class DigitExtractorTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a 5 digit integer: ");
        DigitExtractor de = new DigitExtractor(in.nextInt());

        System.out.println(de.nextDigit());
        System.out.println(de.nextDigit());
        System.out.println(de.nextDigit());
        System.out.println(de.nextDigit());
        System.out.println(de.nextDigit());
    }

}

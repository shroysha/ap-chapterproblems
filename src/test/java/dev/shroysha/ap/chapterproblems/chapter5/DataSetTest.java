package dev.shroysha.ap.chapterproblems.chapter5;

import java.util.Scanner;

public class DataSetTest {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter three numbers:");
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3 = in.nextDouble();

        DataSet s = new DataSet(num1, num2, num3);

        System.out.println("The inputs in sorted order are:\n"
                + s.getSmallest() + "\n"
                + s.getMiddle() + "\n"
                + s.getLargest());
    }
}

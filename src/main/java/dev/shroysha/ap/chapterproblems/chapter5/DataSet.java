package dev.shroysha.ap.chapterproblems.chapter5;

import lombok.Getter;

import java.util.Arrays;
import java.util.Scanner;

public class DataSet {

    @Getter
    private final double smallest;
    @Getter
    private final double middle;
    @Getter
    private final double largest;

    public DataSet(double num1, double num2, double num3) {
        double[] dataset = new double[]{num1, num2, num3};
        Arrays.sort(dataset);
        smallest = dataset[0];
        middle = dataset[1];
        largest = dataset[2];
    }


}

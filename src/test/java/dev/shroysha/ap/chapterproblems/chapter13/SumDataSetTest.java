package dev.shroysha.ap.chapterproblems.chapter13;

public class SumDataSetTest {

    public static void main(String[] args) {

        final int LENGTH = 10;
        int[] values = new int[LENGTH];

        for (int i = 0; i < values.length; i++) {
            values[i] = i - 5;
        }
        SumDataSet d = new SumDataSet(values, 0, values.length - 1);
        System.out.println("Sum: " + d.computeSum());
        System.out.println("Expected: -5");
    }
}

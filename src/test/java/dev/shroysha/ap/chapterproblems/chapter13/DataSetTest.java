package dev.shroysha.ap.chapterproblems.chapter13;

public class DataSetTest {
    public static void main(String[] args) {
        int[] values = {1, 10, 100, -1, -10, -100, 100, 0};
        DataSet d = new DataSet(values, 0, values.length - 1);
        System.out.println("Maximum: " + d.findMaximum());
        System.out.println("Expected: 100");
    }
}

package dev.shroysha.ap.chapterproblems.chapter11;

import java.util.Scanner;

public class RecordReader {

    private final double limit;
    private double total;

    /**
     * Constructs a RecordReader with a zero total.
     */
    public RecordReader(double aLimit) {
        total = 0;
        limit = aLimit;
    }

    public void process(Scanner in) {
        String name = in.next();
        int count = Integer.parseInt(in.next().replaceAll(",", ""));
        double percent = in.nextDouble();

        if (total < limit) {
            System.out.print(name + " ");
        }
        total = total + percent;
    }

    /**
     * Checks whether there are more inputs to process
     *
     * @return true if the limit has not yet been reached
     */
    public boolean hasMore() {
        return total < limit;
    }

}

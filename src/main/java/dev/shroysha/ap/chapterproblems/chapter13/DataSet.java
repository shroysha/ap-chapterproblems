package dev.shroysha.ap.chapterproblems.chapter13;

public class DataSet {

    private final int[] values;
    private final int first;
    private final int last;

    public DataSet(int[] values, int first, int last) {
        this.values = values;
        this.first = first;
        this.last = last;
    }



    public int findMaximum() {
        return findMaximum(first, last, values[0]);
    }

    private int findMaximum(int first, int last, int max) {
        if (first == last)
            return max;
        else if (max < values[first])
            return findMaximum(first + 1, last, values[first]);
        else
            return findMaximum(first + 1, last, max);
    }

}

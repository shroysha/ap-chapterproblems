package dev.shroysha.ap.chapterproblems.chapter13;

public class SumDataSet {

    private final int[] values;
    private final int first;
    private final int last;


    public SumDataSet(int[] values, int first, int last) {
        this.values = values;
        this.first = first;
        this.last = last;
    }

    /**
     * Gets the sum in the set of data values
     *
     * @return the sum value in the set
     */
    public int computeSum() {
        return computeSum(first, last, 0);
    }

    public int computeSum(int first, int last, int sum) {
        if (first == last)
            return sum + values[last];
        else
            return computeSum(first + 1, last, sum + values[first]);
    }

}

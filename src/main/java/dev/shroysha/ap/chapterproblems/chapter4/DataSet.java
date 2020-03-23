package dev.shroysha.ap.chapterproblems.chapter4;

import lombok.Getter;

import java.util.ArrayList;

public class DataSet {

    private final ArrayList<Integer> list;
    @Getter
    private int smallest, largest;

    public DataSet() {
        list = new ArrayList<>();
        smallest = Integer.MAX_VALUE;
        largest = Integer.MIN_VALUE;
    }


    public void addValue(int x) {
        list.add(x);
        for (Integer integer : list) {
            smallest = Math.min(integer, smallest);
            largest = Math.max(integer, largest);
        }
    }

}

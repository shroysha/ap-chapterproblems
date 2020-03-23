package dev.shroysha.ap.chapterproblems.chapter4;

public class DataSetTest {


    public static void main(String[] args) {
        DataSet set = new DataSet();

        System.out.println(set.getLargest());
        set.addValue(40);
        set.addValue(10);
        set.addValue(90);
        System.out.println(set.getLargest());
        System.out.println(set.getSmallest());
    }

}

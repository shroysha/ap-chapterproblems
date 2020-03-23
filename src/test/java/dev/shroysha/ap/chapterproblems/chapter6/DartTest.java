package dev.shroysha.ap.chapterproblems.chapter6;

public class DartTest {

    public static void main(String[] args) {
        Dart d = new Dart();
        d.throwIntoSquare();
        System.out.println(d.getTries());
        System.out.println("Expected: 1");
        int h = d.getHits();
        System.out.println(h == 0 || h == 1);
        System.out.println("Expected: true");
        int hits = d.getHits();
        int tries = d.getTries();
        System.out.println(hits);
        System.out.println(tries);
    }
}


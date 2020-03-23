package dev.shroysha.ap.chapterproblems.chapter13;

public class Sentence3Test {

    public static void main(String[] args) {

        Sentence3 s = new Sentence3("Mississippi!");
        boolean b = s.find("sip");
        System.out.println(b);
        System.out.println("Expected: true");
        b = s.find("tip");
        System.out.println(b);
        System.out.println("Expected: false");
        b = s.find("pi!");
        System.out.println(b);
        System.out.println("Expected: true");

    }



}

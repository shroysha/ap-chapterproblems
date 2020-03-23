package dev.shroysha.ap.chapterproblems.chapter13;

public class Sentence2Test {

    public static void main(String[] args) {

        Sentence2 greeting = new Sentence2("Hello!");
        greeting.reverse();
        System.out.println(greeting.getText());
        System.out.println("Expected: !olleH");
    }

}

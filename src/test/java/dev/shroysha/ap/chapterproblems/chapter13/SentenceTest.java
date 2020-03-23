package dev.shroysha.ap.chapterproblems.chapter13;

public class SentenceTest {

    public static void main(String[] args) {
        Sentence greeting = new Sentence("Hello!");
        greeting.reverse();
        System.out.println(greeting.getText());
        System.out.println("Expected: !olleH");
    }

}


package dev.shroysha.ap.chapterproblems.chapter13;

import lombok.Getter;

public class Sentence2 {

    @Getter
    private String text;

    public Sentence2(String sentence) {
        this.text = sentence;
    }

    public void reverse() {
        text = reverse(0, text.length() - 1);
    }

    private String reverse(int start, int end) {
        String reverse = "";

        if (start == end) return "" + text.charAt(start);

        Sentence2 temp = new Sentence2(text.substring(0, end));
        reverse += text.charAt(end) + temp.reverse(start, end - 1);

        return reverse;
    }

}


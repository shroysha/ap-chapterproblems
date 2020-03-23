package dev.shroysha.ap.chapterproblems.chapter13;

import lombok.Getter;

public class Sentence {

    @Getter
    private String text;

    public Sentence(String sentence) {
        this.text = sentence;
    }

    public void reverse() {
        text = reverse(text.length() - 1);
    }

    private String reverse(int charAt) {
        String reverse = "";

        if (charAt == 0) {
            return "" + text.charAt(charAt);
        }

        Sentence temp = new Sentence(text.substring(0, charAt));
        reverse += text.charAt(charAt) + temp.reverse(charAt - 1);

        return reverse;
    }

}

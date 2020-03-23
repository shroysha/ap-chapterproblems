package dev.shroysha.ap.chapterproblems.chapter13;

public class Sentence3 {


    private final String text;

    public Sentence3(String sentence) {
        this.text = sentence.toLowerCase();
    }

    public boolean find(String searchFor) {
        return find(searchFor.toLowerCase(), 0);
    }

    private boolean find(String searchFor, int start) {
        if (text.substring(start, start + searchFor.length()).equals(searchFor))
            return true;
        else if (start + searchFor.length() == text.length())
            return false;
        else
            return find(searchFor, start + 1);
    }

}

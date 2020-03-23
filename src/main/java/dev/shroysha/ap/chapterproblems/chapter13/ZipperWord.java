package dev.shroysha.ap.chapterproblems.chapter13;

public class ZipperWord {

    private String first;
    private String second;

    public ZipperWord(String word1, String word2) {
        assert word1.length() == word2.length();
        first = word1;
        second = word2;
    }

    public static String check(String word1, String word2) {
        ZipperWord zippy = new ZipperWord(word1, word2);
        return zippy.toString();
    }

    public String toString() {
        if (first.equals("")) {
            return "";
        }
        char firstChar = first.charAt(0);
        char secondChar = second.charAt(0);
        String next1 = first.substring(1);
        String next2 = second.substring(1);
        return firstChar + secondChar + new ZipperWord(next1, next2).toString();
    }
}

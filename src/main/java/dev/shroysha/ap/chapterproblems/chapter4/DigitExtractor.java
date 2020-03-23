package dev.shroysha.ap.chapterproblems.chapter4;

public class DigitExtractor {

    private final int[] digits;
    private int position;

    public DigitExtractor(int anInteger) {
        position = 5;
        String digit = "";
        digit += anInteger;
        digits = new int[digit.trim().length()];

        for (int i = 0; i < digit.length(); i++) {
            String blah = digit.substring(i, i + 1);
            digits[i] = Integer.parseInt(blah);
        }
    }

    public int nextDigit() {
        position--;
        return digits[position];
    }

}

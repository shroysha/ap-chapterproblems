package dev.shroysha.ap.chapterproblems.chapter6;

public class CompressorTest {
    public static void main(String[] args) {
        Compressor c = new Compressor();
        String compressed = c.compressImage("RRRGGGYYYYWBWWRGBBBBBRRR");
        System.out.println(compressed);
        System.out.println(compressed.equals("3R3G4Y1W1B2W1R1G5B3R"));
    }
}

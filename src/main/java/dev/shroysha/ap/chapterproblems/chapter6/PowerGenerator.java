package dev.shroysha.ap.chapterproblems.chapter6;

public class PowerGenerator {

    private final double factor;
    private int exponent;

    public PowerGenerator(double aFactor) {
        exponent = -1;
        factor = aFactor;
    }



    /**
     * Computes the next power.
     */
    public double nextPower() {
        exponent++;
        return Math.pow(factor, exponent);
    }

}

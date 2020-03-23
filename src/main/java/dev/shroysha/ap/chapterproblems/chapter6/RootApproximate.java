package dev.shroysha.ap.chapterproblems.chapter6;

public class RootApproximate {

    private final double a;
    private final double e;
    private double x;
    private double lastX;
    private boolean firstGuess;

    public RootApproximate(double a, double EPSILON) {
        this.a = a;
        e = EPSILON;
        x = 1;
        firstGuess = true;
    }



    public boolean hasMoreGuesses() {
        return !(Math.abs(lastX - x) < e);
    }

    public double nextGuess() {
        if (!firstGuess) {
            lastX = x;
            x = (x + a / x) / 2;
        } else {
            x = 1;
            firstGuess = false;
        }
        return x;
    }

}

package dev.shroysha.ap.chapterproblems.chapter6;

import lombok.Getter;

public class Dart {

    public static final double AREA_OF_CIRCLE = Math.PI;
    public static final double AREA_OF_SQUARE = 4;
    @Getter
    private int hits, tries;

    /**
     * Throws a dart into the square [-1,1] x [1,1] and records
     * whether it hits the unit circle.
     */
    public void throwIntoSquare() {
        double random = Math.random();
        double percentage = AREA_OF_CIRCLE / AREA_OF_SQUARE;

        if (random < percentage)
            hits++;

        tries++;
    }

}


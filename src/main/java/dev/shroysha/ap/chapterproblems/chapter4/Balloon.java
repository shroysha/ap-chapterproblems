package dev.shroysha.ap.chapterproblems.chapter4;

import lombok.Getter;

public class Balloon {

    @Getter
    private double volume = 0, radius = 0, surfaceArea = 0;

    public Balloon() {
        volume = 0;
        radius = 0;
    }


    public void addAir(int amount) {
        volume += amount;
        radius = computeRadius(volume);
        surfaceArea = computeSurfaceArea(radius);
    }

    private double computeRadius(double volume) {
        /*
         * V= 4/3 pi r^3
         * 3V/4 = pi r^3
         * 3V/4pi = r ^3
         */
        return Math.pow((3.0 * volume) / (4.0 * Math.PI), (1.0 / 3));
    }

    private double computeSurfaceArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }

}

package dev.shroysha.ap.chapterproblems.chapter4;

public class BalloonTest {

    public static void main(String[] args) {
        Balloon b = new Balloon();

        final int CYCLES = 2;
        for (int i = 0; i < CYCLES; i++) {
            b.addAir(100);
            System.out.println(b.getVolume());
            System.out.println(b.getRadius());
            System.out.println(b.getSurfaceArea());
        }

    }

}

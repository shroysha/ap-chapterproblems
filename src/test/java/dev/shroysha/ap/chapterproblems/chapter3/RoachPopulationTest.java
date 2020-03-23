package dev.shroysha.ap.chapterproblems.chapter3;

/**
 * This program simulates the growth of a roach population.
 */
public class RoachPopulationTest {

    public static void main(String[] args) {
        RoachPopulation population = new RoachPopulation(10);

        final int CYCLES = 4;
        for (int i = 0; i < CYCLES; i++) {
            population.breed();
            population.spray();
            System.out.println("" + population.getRoaches() + " roaches");
        }

    }

}

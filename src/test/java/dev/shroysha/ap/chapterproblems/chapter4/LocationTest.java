package dev.shroysha.ap.chapterproblems.chapter4;

public class LocationTest {

    public static void main(String[] args) {
        // Compute distance from Atlanta, Georgia to San Francisco, California
        Location atlanta = new Location(33.755, -84.39);
        Location sanFrancisco = new Location(37.7793, -122.4192);
        System.out.printf("%8.1f kilometers\n", atlanta.computeDistance(sanFrancisco));
        System.out.println("Expected: 3436.5 kilometers");
        // Should be the same distance either way
        System.out.printf("%8.1f kilometers\n", sanFrancisco.computeDistance(atlanta));
        System.out.println("Expected: 3436.5 kilometers");
    }

}

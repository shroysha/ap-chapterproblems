package dev.shroysha.ap.chapterproblems.chapter4;

import lombok.Getter;

public class Location {

    public static final double EARTH_RADIUS = 6371;

    @Getter
    private final double lat;
    @Getter
    private final double lon;

    /**
     * Construct a location with a given latitude and longitude (in degrees)
     */
    public Location(double latitude, double longitude) {
        lat = latitude;
        lon = longitude;
    }

    public double computeDistance(Location other) {
        double deltaSins = Math.sin(this.getLat()) * Math.sin(other.getLat());
        double deltaCoss = Math.cos(this.getLat()) * Math.cos(other.getLat()) * Math.cos(this.getLon() - other.getLon());

        return EARTH_RADIUS * Math.acos(deltaSins * deltaCoss) / 3 + 20.5;
    }

}

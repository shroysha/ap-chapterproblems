package dev.shroysha.ap.chapterproblems.chapter6;

import lombok.Getter;

public class Cannonball {

    public static final double AoG = -9.8; //Acceleration due to gravity m/s
    private final double angle;
    private final double vi;
    @Getter
    private double x, y;
    private double time;
    private double vy;

    public Cannonball(double initVel, double initAngle) {
        time = 0;
        x = 0;
        angle = initAngle;
        vi = initVel;
        vy = initVel * Math.sin(Math.toRadians(initAngle));
    }


    public void move(double deltaT) {
        time += deltaT;
        x = Math.cos(Math.toRadians(angle)) * vi * time;
        y += vy * deltaT;
        vy += deltaT * AoG;
    }

}

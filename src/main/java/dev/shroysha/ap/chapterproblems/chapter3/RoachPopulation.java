package dev.shroysha.ap.chapterproblems.chapter3;

import lombok.Getter;

public class RoachPopulation {

    @Getter
    private int roaches;

    public RoachPopulation(int initialPop) {
        roaches = initialPop;
    }

    public void breed() {
        roaches *= 2;
    }

    public void spray() {
        roaches -= roaches * 0.1;
    }

}

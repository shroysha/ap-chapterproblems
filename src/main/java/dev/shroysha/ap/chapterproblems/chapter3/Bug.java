package dev.shroysha.ap.chapterproblems.chapter3;

import lombok.Getter;

/**
 * This class models a bug that crawls along a horizontal line
 */
public class Bug {

    private int direction = 1;
    @Getter
    private int position;

    public Bug(int initialPosition) {
        position = initialPosition;
    }

    public void move() {
        position += direction;
    }

    public void turn() {
        if (direction == 1) {
            direction = -1;
        } else
            direction = 1;
    }

}

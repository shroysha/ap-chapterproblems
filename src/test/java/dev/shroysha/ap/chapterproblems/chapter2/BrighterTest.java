package dev.shroysha.ap.chapterproblems.chapter2;

import java.awt.*;

public class BrighterTest {

    public static void main(String[] args) {
        Color color = new Color(50, 100, 150);
        color = color.brighter();

        System.out.println(color.getRed() + ", " + color.getGreen() + ", " + color.getBlue());
    }

}


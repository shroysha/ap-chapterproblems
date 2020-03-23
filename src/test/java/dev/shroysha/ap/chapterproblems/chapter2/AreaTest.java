package dev.shroysha.ap.chapterproblems.chapter2;

import java.awt.*;

public class AreaTest {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(400, 300);

        double height = rectangle.getHeight();
        double width = rectangle.getWidth();

        double area = height * width;
        System.out.println("Area: " + area);
    }

}

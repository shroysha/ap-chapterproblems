package dev.shroysha.ap.chapterproblems.chapter3;

import javax.swing.*;
import java.awt.*;

public class CarComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        new Car(Color.blue).drawCar(g2d, new Point(0, 0));
        new Car(Color.green).drawCar(g2d, new Point(200, 150));
    }

    public static class Car {

        private final Color carColor;

        public Car(Color colorOfCar) {
            carColor = colorOfCar;
        }

        public void drawCar(Graphics2D g, Point position) {
            final int x = position.x;
            final int y = position.y;
            g.setColor(carColor);
            //Draw Roof
            g.drawLine(x + 5, y + 10, x + 10, y);
            g.drawLine(x + 10, y, x + 30, y);
            g.drawLine(x + 30, y, x + 35, y + 10);
            //Draw Body
            g.drawRect(x, y + 10, 40, 10);
            //Draw Wheels
            g.drawOval(x, y + 20, 10, 10);
            g.drawOval(x + 30, y + 20, 10, 10);

        }

    }

}

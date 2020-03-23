package dev.shroysha.ap.chapterproblems.chapter6;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class CannonballComponent extends JComponent {

    private final Cannonball ball;

    public CannonballComponent(double ivel, double ang) {
        ball = new Cannonball(ivel, ang);
    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        while (ball.getY() >= 0) {
            final double DELTA_T = .02;
            ball.move(DELTA_T);

            Ellipse2D circle = new Ellipse2D.Double(ball.getX() - 1, this.getHeight() - ball.getY() - 1, 3, 3);

            g2.draw(circle);
        }
    }
}

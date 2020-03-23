package dev.shroysha.ap.chapterproblems.chapter2;

import javax.swing.*;
import java.awt.*;

public class NameComponent extends JComponent {
    /**
     * Draws a name in red inside a blue rectangle.
     */
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle blueRect = new Rectangle(300, 100);
        g2.setColor(Color.blue);
        g2.fill(blueRect);
        g2.setColor(Color.red);

        String name = "me";
        g2.drawString(name, 90, 40);
    }

}

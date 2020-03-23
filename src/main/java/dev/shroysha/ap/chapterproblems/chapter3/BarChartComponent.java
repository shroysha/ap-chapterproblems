package dev.shroysha.ap.chapterproblems.chapter3;

import javax.swing.*;
import java.awt.*;

/**
 * Draws a chart of bridge spans.
 */
public class BarChartComponent extends JComponent {

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // construct and draw four Bar objects
        new Bar(0, 400, "Golden Gate").draw(g2);
        new Bar(80, 250, "Brooklyn").draw(g2);
        new Bar(160, 300, "Delaware Memorial").draw(g2);
        new Bar(240, 100, "Mackinac").draw(g2);
    }


    /**
     * This class describes a bar in a bar chart
     */
    public static class Bar {

        private final int top;
        private final int width;
        private final String title;


        public Bar(int aTop, int aWidth, String aTitle) {
            top = aTop;
            width = aWidth;
            title = aTitle;
        }

        public void draw(Graphics2D g2) {
            final int barHeight = 20;

            Rectangle bar = new Rectangle(0, top, width, barHeight);
            g2.draw(bar);

            g2.drawString(title, 5, top + barHeight / 2 + 5);
        }

    }
}

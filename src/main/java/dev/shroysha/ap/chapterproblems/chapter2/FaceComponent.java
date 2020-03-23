package dev.shroysha.ap.chapterproblems.chapter2;

import javax.swing.*;
import java.awt.*;

public class FaceComponent extends JComponent {

    /**
     * Draws a face.
     */
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawOval(50, 50, 200, 200);   // Draw face
        g2.drawOval(75, 75, 25, 25);      // Draw left eye
        g2.drawOval(125, 75, 25, 25);    // Draw right eye
        g2.drawLine(75, 175, 150, 175);      // Draw mouth
    }

}

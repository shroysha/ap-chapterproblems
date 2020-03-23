package dev.shroysha.ap.chapterproblems.chapter2;

import javax.swing.*;

public class FaceComponentTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 400);
        frame.setTitle("FaceViewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FaceComponent component = new FaceComponent();
        frame.add(component);

        frame.setVisible(true);
    }

}

package dev.shroysha.ap.chapterproblems.chapter2;

import javax.swing.*;

public class NameComponentTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(300, 100);
        frame.setTitle("NameViewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NameComponent component = new NameComponent();
        frame.add(component);

        frame.setVisible(true);
    }

}



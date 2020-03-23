package dev.shroysha.ap.chapterproblems.chapter4;

import java.util.Scanner;

public class TimerTest {

    public static void main(String[] args) {
        Timer t = new Timer();
        t.add(40); // 40 minutes
        t.add(50); // another 50 minutes
        System.out.println("Total: " + t.formatTotal());
        System.out.println("Expected: 1:30");
    }

    public static void test2(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the first time: ");
        int t1 = in.nextInt();
        System.out.println("Please enter the second time: ");
        int t2 = in.nextInt();

        Timer.TimerInterval ti = new Timer.TimerInterval(t1, t2);

        System.out.println(ti.getHours() + " hours " + ti.getMinutes() + " minutes");
    }

}

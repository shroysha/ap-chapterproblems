package dev.shroysha.ap.chapterproblems.chapter13;

public class DiskMoverTest {

    public static void main(String[] args) {
        int n = 3;
        DiskMover mover = new DiskMover(1, 3, n);
        System.out.println(mover.nextMove());
        System.out.println("Expected: Move disk from peg 1 to peg 3");
        System.out.println(mover.nextMove());
        System.out.println("Expected: Move disk from peg 1 to peg 2");
        System.out.println(mover.nextMove());
        System.out.println("Expected: Move disk from peg 3 to peg 2");
        System.out.println(mover.nextMove());
        System.out.println("Expected: Move disk from peg 1 to peg 3");
        System.out.println(mover.nextMove());
        System.out.println("Expected: Move disk from peg 2 to peg 1");
        System.out.println(mover.nextMove());
        System.out.println("Expected: Move disk from peg 2 to peg 3");
        System.out.println(mover.nextMove());
        System.out.println("Expected: Move disk from peg 1 to peg 3");
        System.out.println(mover.hasMoreMoves());
        System.out.println("Expected: false");
    }

}

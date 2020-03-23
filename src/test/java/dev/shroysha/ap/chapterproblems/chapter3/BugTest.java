package dev.shroysha.ap.chapterproblems.chapter3;

public class BugTest {

    public static void main(String[] args) {
        // make the bug move and turn a few times
        Bug lady = new Bug(10);
        lady.move();
        lady.turn();
        lady.move();
        lady.move();
        // print the actual and expected position
        System.out.println(lady.getPosition());
        System.out.println("Expected: 9");
    }

}

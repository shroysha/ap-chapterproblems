package dev.shroysha.ap.chapterproblems.chapter13;

public class DiskMover {

    private static final int BEFORE_LARGEST = 0;
    private static final int LARGEST = 1;
    private static final int AFTER_LARGEST = 2;
    private static final int DONE = 3;
    private int source, target, disks;
    private DiskMover otherMover;
    private int status;

    public DiskMover(int source, int dest, int disks) {
        if (source == dest) {
            throw new java.lang.UnsupportedOperationException("The source cannot equal the destination");
        }

        this.source = source;
        this.target = dest;
        this.disks = disks;
        int other = 6 - source - target;
        if (disks > 1)
            otherMover = new DiskMover(source, other, disks - 1);
        status = BEFORE_LARGEST;
    }



    public boolean hasMoreMoves() {
        return status != DONE;
    }

    public String nextMove() {
        int[] temp = nexMove();
        return toFromString(temp[0], temp[1]);
    }

    private int[] nexMove() {

        //If there is only one disk, just move the disk to the target and it's over
        if (disks == 1) {
            status = DONE;
            return new int[]{source, target};
        }


        if (status == LARGEST) {
            status = AFTER_LARGEST;
            int other = 6 - source - target;
            otherMover = new DiskMover(other, target, disks - 1);
            return new int[]{source, target};
        }

        int[] r = otherMover.nexMove();

        if (!otherMover.hasMoreMoves()) {
            if (status == BEFORE_LARGEST)
                status = LARGEST;
            else
                status = DONE;
        }

        return r;
    }

    private String toFromString(int source, int target) {
        return "Move disk from peg " + source + " to peg " + target;
    }
}


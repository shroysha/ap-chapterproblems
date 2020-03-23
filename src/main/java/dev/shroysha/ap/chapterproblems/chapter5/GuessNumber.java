package dev.shroysha.ap.chapterproblems.chapter5;

import java.util.Random;

public class GuessNumber {

    private int number;

    /**
     * Construct an GuessNumber with a random value between 1 and 50
     */
    public GuessNumber() {
        Random r = new Random();
        number = r.nextInt(50) + 1;
    }

    public static String check(int number, int guess) {
        GuessNumber gn = new GuessNumber();
        gn.number = number;
        return gn.howClose(guess);
    }

    /**
     * Determine how close the guess is and return a hint
     * 20 or more above the number: The hint is "Burning Hot"
     * 10 to 19 above the number: The hint is "Hot"
     * 5 to 9 above the number: The hint is "Warm"
     * 4 below the number to 4 above: The hint is "Pleasant"
     * 5 to 9 below the number: The hint is "Cool"
     * 10 to 19 below the number: The hint is "Cold"
     * 20 or more below the number: The hint is "Ice Cold"
     *
     * @return a string describing, in terms of hotness or coldness, how close the guess is to the number
     */
    public String howClose(int guess) {
        int displacement = guess - number;

        if (displacement >= 20)
            return "Burning Hot";
        else if (displacement >= 10)
            return "Hot";
        else if (displacement >= 5)
            return "Warm";
        else if (displacement >= -4)
            return "Pleasant";
        else if (displacement >= -9)
            return "Cool";
        else if (displacement >= -19)
            return "Cold";
        else
            return "Ice Cold";

    }

}

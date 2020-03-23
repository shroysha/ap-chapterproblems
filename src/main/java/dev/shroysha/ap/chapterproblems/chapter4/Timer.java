package dev.shroysha.ap.chapterproblems.chapter4;

import lombok.Getter;

public class Timer {

    private int hours;
    private int minutes;

    /**
     * Construct a timer with 0:0O elapsed time
     */
    public Timer() {
        hours = 0;
        minutes = 0;
    }

    public void add(int minutesToAdd) {
        minutes += minutesToAdd;
        while (minutes >= 60) {
            minutes -= 60;
            hours++;
        }
    }

    /**
     * Gets the total elapsed time.
     *
     * @return a string describing the total time in the format h:mm,
     * with mm < 60
     */
    public String formatTotal() {
        return String.format("%d:%02d", hours, minutes);
    }

    public static class TimerInterval {

        public static final int MINUTES_IN_HOUR = 60, HOURS_IN_DAY = 24;

        private final int time1;
        private final int time2;
        @Getter
        private int hours, minutes;

        public TimerInterval(int t1, int t2) {
            time1 = t1;
            time2 = t2;
            compute();
        }

        private void compute() {
            String time1Text = "" + time1;
            int time1Minutes = Integer.parseInt(time1Text.substring(time1Text.length() - 2));
            int time1Hours;
            if (time1Text.length() == 4)
                time1Hours = Integer.parseInt(time1Text.substring(0, 2));
            else
                time1Hours = Integer.parseInt(time1Text.substring(0, 1));

            String time2Text = "" + time2;
            int time2Minutes = Integer.parseInt(time2Text.substring(time2Text.length() - 2));
            int time2Hours;
            if (time2Text.length() == 4) {
                time2Hours = Integer.parseInt(time2Text.substring(0, 2));
            } else {
                time2Hours = Integer.parseInt(time2Text.substring(0, 1));
            }

            if (time1 < time2) {
                hours = time2Hours - time1Hours;
            } else {
                hours = time2Hours + HOURS_IN_DAY - time1Hours;
            }
            minutes = (time2Minutes - time1Minutes) % MINUTES_IN_HOUR;
            while (minutes < 0) {
                minutes += MINUTES_IN_HOUR;
                hours--;
            }

        }

    }
}

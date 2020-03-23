package dev.shroysha.ap.chapterproblems.chapter5;

import lombok.Getter;

public class Grade {

    @Getter
    private final double numericGrade;

    public Grade(String input) {
        numericGrade = this.computeNumericGrade(input);
    }


    private double computeNumericGrade(String input) {
        double grade;
        input = input.trim();

        if (input.charAt(0) == 'A') {
            grade = 4.0;
            grade += signConverter(input);
        } else if (input.charAt(0) == 'B') {
            grade = 3.0;
            grade += signConverter(input);
        } else if (input.charAt(0) == 'C') {
            grade = 2.0;
            grade += signConverter(input);

        } else if (input.charAt(0) == 'D') {
            grade = 1.0;
            grade += signConverter(input);
        } else if (input.charAt(0) == 'F')
            grade = 0.0;
        else
            grade = -1.0;

        return grade;
    }

    private double signConverter(String input) {
        if (input.length() == 2) {
            char sign = input.charAt(1);
            if (sign == '+') {
                if (input.charAt(0) == 'A')
                    return 0;
                else
                    return 0.3;
            } else
                return -0.3;
        } else
            return 0;
    }

}

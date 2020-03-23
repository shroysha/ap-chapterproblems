package dev.shroysha.ap.chapterproblems.chapter6;

public class PhoneNumbers {

    public static String cleanNumber(String phoneNumber) {
        /*
         Desired format (###) ###-####
         */
        String cleanNumber = "(";

        for (int i = 0; i < phoneNumber.length(); i++) {
            char ch = phoneNumber.charAt(i);
            if (Character.isDigit(ch)) {
                cleanNumber += "" + ch;
            }
            if (cleanNumber.length() == 4) {
                cleanNumber += ") ";
            }
            if (cleanNumber.length() == 9) {
                cleanNumber += "-";
            }
        }

        if (cleanNumber.length() == 14)
            return cleanNumber;
        else
            return "Error";
    }
}

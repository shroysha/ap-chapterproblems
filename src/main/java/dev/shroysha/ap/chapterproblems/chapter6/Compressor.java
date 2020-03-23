package dev.shroysha.ap.chapterproblems.chapter6;

public class Compressor {



    public String compressImage(String imageColors) {
        StringBuilder codedImage = new StringBuilder();
        int count = 1;
        char lastDigit, currentDigit = 'e';

        for (int i = 1; i < imageColors.length(); i++) {
            lastDigit = imageColors.charAt(i - 1);
            currentDigit = imageColors.charAt(i);

            if (lastDigit == currentDigit) {
                count++;
            } else {
                codedImage.append(count).append(lastDigit);
                count = 1;
            }
        }
        codedImage.append(count).append(currentDigit);
        return codedImage.toString();
    }

}

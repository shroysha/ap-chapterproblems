package dev.shroysha.ap.chapterproblems.chapter2;

public class ReplacementTest {
    public static void main(String[] args) {
        String greeting = "Hello, elite hacker!";
        String modifiedGreeting;
        // your work here
        modifiedGreeting = replace(greeting);
        // call the replace method four times

        System.out.println(modifiedGreeting);
        System.out.println("Expected: H3770, 371t3 hack3r!");
    }

    public static String replace(String def) {
        StringBuilder modified = new StringBuilder();
        for (int i = 0; i < def.length(); i++) {
            char charAPos = def.charAt(i);

            if (charAPos == 'l')
                modified.append('7');
            else if (charAPos == 'o')
                modified.append('0');
            else if (charAPos == 'i')
                modified.append('1');
            else if (charAPos == 'e')
                modified.append('3');
            else
                modified.append(charAPos);
        }
        return modified.toString();
    }
}

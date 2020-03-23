package dev.shroysha.ap.chapterproblems.chapter11;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WebReader {

    public static boolean checkURL(String site) throws IOException {
        URL u = new URL(site);
        Scanner in = new Scanner(u.openStream());
        return in.hasNextLine();
    }

    public static String check(String site) {
        try {
            if (checkURL(site))
                return "good";
            else
                return "empty";
        } catch (MalformedURLException ex) {
            return "bad URL";
        } catch (Exception ex) {
            return "bad";
        }
    }

}

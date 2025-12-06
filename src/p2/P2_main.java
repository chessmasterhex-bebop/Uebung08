package p2;

public class P2_main {

    public static String shortenToLowerCase(String input, int shortenBy) {
        // Fall 1: Wir schneiden mehr ab als enthalten → leerer String
        if (shortenBy >= input.length()) {
            return "";
        }

        // Fall 2: String kürzen
        String shortened = input.substring(0, input.length() - shortenBy);

        // Fall 3: in Kleinbuchstaben zurückgeben
        return shortened.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(shortenToLowerCase("RindfLeischetikETTierung", 13));
        // Ausgabe: "rindfleisch"
    }
}

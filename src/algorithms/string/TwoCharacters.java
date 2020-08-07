package algorithms.string;

public class TwoCharacters {

    static int alternate(String s) {

        int maxPattern = 0;

        if (s.length() == 1) return maxPattern;

        for (int i = 0; i < 26; i++) {
            nextLetter:
            for (int j = i+1; j < 26; j++) {
                char one = (char) ('a' + i);
                char two = (char) ('a' + j);
                char lastSeen = '\u0000';
                int patternLength = 0;

                for (char letter: s.toCharArray()){
                    if (letter == one || letter == two) {
                        if (lastSeen == letter) continue nextLetter;
                        patternLength++;
                        lastSeen = letter;
                    }
                }

                maxPattern = Math.max(patternLength, maxPattern);
            }
        }

        return maxPattern;
    }

    public static void main(String[] args) {
        System.out.println(alternate("beabeefeab"));
    }
}

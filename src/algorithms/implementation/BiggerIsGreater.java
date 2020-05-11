package algorithms.implementation;

public class BiggerIsGreater {
    static String biggerIsGreater(String word) {
        int index = word.length() - 2;
        while (index >= 0 && word.charAt(index) >= word.charAt(index + 1)) {
            index--;
        }

        if (index < 0) {
            return "no answer";
        }

        int biggerIndex = index + 1;
        while (biggerIndex + 1 < word.length() && word.charAt(biggerIndex + 1) > word.charAt(index)) {
            biggerIndex++;
        }

        StringBuilder next = new StringBuilder(word);
        swap(next, index, biggerIndex);
        reverse(next, index + 1, next.length() - 1);
        return next.toString();
    }

    static void swap(StringBuilder sb, int index1, int index2) {
        char temp = sb.charAt(index1);
        sb.setCharAt(index1, sb.charAt(index2));
        sb.setCharAt(index2, temp);
    }

    static void reverse(StringBuilder sb, int beginIndex, int endIndex) {
        for (int i = beginIndex, j = endIndex; i < j; i++, j--) {
            swap(sb, i, j);
        }
    }


    public static void main(String[] args) {
        System.out.println(biggerIsGreater("aa"));
        System.out.println(biggerIsGreater("abcd"));
        System.out.println(biggerIsGreater("dbca"));
        System.out.println(biggerIsGreater("fedcbabcd")); // fedcbabdc
        System.out.println(biggerIsGreater("dcbb")); // no answer
        System.out.println(biggerIsGreater("abdc"));  //acbd
        System.out.println(biggerIsGreater("dkhc"));  // hcdk


    }
}

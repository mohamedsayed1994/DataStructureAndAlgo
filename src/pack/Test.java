package pack;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

//        System.out.println(FirstFactorial(7));
//        System.out.println(FirstReverse("Hello Mohamed"));
//        System.out.println(FirstReverse("Hello World and Coders"));
//        System.out.println(LetterChanges("fun times!"));
//        System.out.println(LetterChanges("this long cake@&"));
//        System.out.println(LetterChanges("this long cake@&").equals("UIjt mpOh dblf@&"));
        int x = 10;
        int y = x;
        System.out.println("x: " + x + " y: " + y);
        x = 11;
        System.out.println("x: " + x + " y: " + y);
    }

    //Letter Changes
    public static String LetterChanges(String str) {
        String next = new String();
        //str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                int charValue = str.charAt(i);
                next = next + "" + (char) (charValue + 1);
            } else {
                next = next + "" + str.charAt(i);
            }
        }

        return convertToupper(next);
    }

    public static String convertToupper(String str) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        List<String> list = Arrays.asList(vowels);
        for (int i = 0; i < str.length(); i++) {
            if (list.contains(String.valueOf(str.charAt(i)))) {
                str = str.replace(str.charAt(i), Character.toUpperCase(str.charAt(i)));
            }
        }
        return str;
    }

    //reverse String
    public static String FirstReverse(String str) {
        StringBuilder reverseString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            reverseString = reverseString.append(c);
        }
        String rev = String.valueOf(reverseString);
        return rev;
    }

    public static int FirstFactorial(int num) {
        int count = 1;
        for (int i = 1; i <= num; i++) {
            count = count * i;
        }
        return count;
    }
}

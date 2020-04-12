package F5_Stacks;

import java.util.LinkedList;

public class ChallengePalindrome {
    // ignore case, punctuation and spaces
    //"I did, did i?" - "Racecar" - "Hello"

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));

    }

    public static boolean checkForPalindrome(String string) {
        String stringLower = string.toLowerCase();
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder stringNoPunctuation = new StringBuilder(string.length());
        for (int i = 0; i < stringLower.length(); i++) {
            char c = stringLower.charAt(i);
            if (c >= 'a' && c <= 'z') {
                stack.push(c);
                stringNoPunctuation.append(c);
            }
        }
        StringBuilder theStack = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            theStack.append(stack.pop());
        }
        return theStack.toString().equals(stringNoPunctuation.toString());
    }
}

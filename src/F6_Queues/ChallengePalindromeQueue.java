package F6_Queues;

import java.util.LinkedList;

public class ChallengePalindromeQueue {
    // ignore case, punctuation and spaces
    //"I did, did i?" - "Racecar" - "Hello"
    public static void main(String[] args) {
        // should return true
        System.out.println(isPalindrome("abccba"));
        // should return true
        System.out.println(isPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(isPalindrome("I did, did I?"));
        // should return false
        System.out.println(isPalindrome("hello"));
        // should return true
        System.out.println(isPalindrome("Don't nod"));

    }

    public static boolean isPalindrome(String str) {
        LinkedList<Character> queue = new LinkedList<>();
        LinkedList<Character> stack = new LinkedList<>();
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }
        return true;
    }
}

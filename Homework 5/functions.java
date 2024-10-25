/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/

public class functions {
    public static void main(String[] args) {
        String testWord = "level";
        System.out.println(testWord + " is " + isPalindrome(testWord) + ".");
    }

    public static String isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return "Not a palindrome";
            }
            left++;
            right--;
        }
        return "Palindrome";
    }
}

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class PalindromeChecker {

    public static boolean isPalindrome(String input) {
        // Create a queue to store characters
        Queue<Character> queue = new LinkedList<>();
        // Enqueue characters from the input string
        for (char c : input.toCharArray()) {
            queue.add(c);
        }
        // Dequeue characters and compare with the end of the string
        while (!queue.isEmpty()) {
//king
            char front = queue.remove();
            char end = input.charAt(input.length() - 1);
            if (front != end) {
                return false; // Not a palindrome
            }
            input = input.substring(0, input.length() - 1);
        }

        return true; 
    }

    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

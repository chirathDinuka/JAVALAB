package Q10;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String text = input.nextLine();

        String clean = text.replaceAll("\\s+", "").toLowerCase();

        String reverse = "";

        for (int i = clean.length() - 1; i >= 0; i--) {
            reverse += clean.charAt(i);
        }

        if (clean.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
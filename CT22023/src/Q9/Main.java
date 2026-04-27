package Q9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String userText = inputScanner.nextLine();

        System.out.println(userText.length());
        System.out.println(userText.charAt(0));
        System.out.println(userText.charAt(userText.length() - 1));
    }

}

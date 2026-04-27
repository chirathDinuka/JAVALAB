package Q8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String fullText = inputScanner.nextLine();
        int splitIndex = fullText.indexOf("!");

        String firstPart = fullText.substring(0, splitIndex).trim();
        String secondPart = fullText.substring(splitIndex + 1).trim();

        System.out.println(firstPart);
        System.out.println(secondPart);
    }
}
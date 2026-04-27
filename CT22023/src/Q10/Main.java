package Q10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String wordInput = inputScanner.nextLine();
        int middleIndex = wordInput.length() /2;

        System.out.println(wordInput.charAt(middleIndex));

    }
}


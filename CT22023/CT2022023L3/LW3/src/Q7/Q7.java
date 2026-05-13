package Q7;

import java.util.Scanner;

public class Q7 {

    public static int countDigits(int number) {

        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        do {

            System.out.print("Enter number: ");
            num = input.nextInt();

            if (num >= 0) {
                System.out.println("Number of digits: " + countDigits(num));
            }

        } while (num >= 0);
    }
}

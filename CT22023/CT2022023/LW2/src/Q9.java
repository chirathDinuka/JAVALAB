package Q9;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter interest rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double finalAmt = principal * Math.pow(1 + (rate / 100.0), years);

        System.out.println("Final Amount: " + finalAmt);
    }
}
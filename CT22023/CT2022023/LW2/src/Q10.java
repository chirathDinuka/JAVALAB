import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MONTHS = 12;

        System.out.print("Enter loan amount: ");
        double loanVal = sc.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter loan period (years): ");
        int periodYears = sc.nextInt();

        double monthlyRate = annualRate / 100.0 / MONTHS;
        int totalPayments = periodYears * MONTHS;

        double monthlyPay = (loanVal * monthlyRate) /
                (1 - Math.pow(1 / (1 + monthlyRate), totalPayments));

        double totalPay = monthlyPay * totalPayments;

        System.out.println("Monthly Payment: " + monthlyPay);
        System.out.println("Total Payment: " + totalPay);
    }
}
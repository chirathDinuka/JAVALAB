import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter length in centimeters: ");
        double centimeters = scanner.nextDouble();

        // Convert centimeters to inches
        double totalInches = centimeters / 2.54;

        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Display result
        System.out.println("Converted Length:");
        System.out.println(feet + " feet and " + inches + " inches");

        scanner.close();
    }
}
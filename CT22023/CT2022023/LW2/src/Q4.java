package Q4;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter body weight (pounds): ");
        double bodyWt = sc.nextDouble();

        double calNeed = bodyWt * 19;

        System.out.println("Required Calories: " + calNeed);
    }
}
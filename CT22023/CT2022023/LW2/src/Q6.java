package Q6;
import java.util.Scanner;
import java.util.Calendar;

public class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int yearBorn = sc.nextInt();

        int currentYr = Calendar.getInstance().get(Calendar.YEAR);
        int ageNow = currentYr - yearBorn;

        System.out.println("You were born in " + yearBorn + " and will be (are) " + ageNow + " this year.");
    }
}
package Q3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);


        String firstName = inputScanner.nextLine();
        String middleName = inputScanner.nextLine();
        String lastName = inputScanner.nextLine();

        System.out.println(firstName  + " " + middleName.charAt(0) + "." + lastName);
    }
}

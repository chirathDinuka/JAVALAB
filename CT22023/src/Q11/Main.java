package Q11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner  input =new Scanner(System.in);

        String firstName = input.next();
        String middleName = input.next();
        String lastName = input.next();

        System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
    }
}



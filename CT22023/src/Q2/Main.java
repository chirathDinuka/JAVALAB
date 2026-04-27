package Q2;
import javax.swing.JFrame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("First Name:");
        String firstName = inputScanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = inputScanner.nextLine();

        JFrame nameFrame = new JFrame(firstName + " " + lastName);
        nameFrame.setSize(400, 300);
        nameFrame.setVisible(true);
    }
}

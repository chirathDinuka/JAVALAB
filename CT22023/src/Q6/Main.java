package Q6;
import javax.swing.JFrame;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Width: ");
        int w = inputScanner.nextInt();

        System.out.print("Height: ");
        int h=inputScanner.nextInt();

        inputScanner.nextLine();

        System.out.print("Title: ");
        String title = inputScanner.nextLine();

        JFrame frame = new JFrame(title);
        frame.setSize(w,h);
        frame.setVisible(true);
    }
}

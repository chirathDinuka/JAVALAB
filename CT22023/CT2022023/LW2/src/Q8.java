import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double rad = sc.nextDouble();

        double vol = (4.0 / 3) * Math.PI * Math.pow(rad, 3);

        System.out.println("Volume: " + vol);
    }
}
package Q5;

import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0;
        int choice;

        do {

            System.out.println("\n1. Entree");
            System.out.println("2. Side Dish");
            System.out.println("3. Drink");
            System.out.println("4. Exit");

            System.out.print("Select category: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("1. Tofu Burger - $3.49");
                    System.out.println("2. Cajun Chicken - $4.59");

                    System.out.print("Select item: ");
                    int e = input.nextInt();

                    System.out.print("Quantity: ");
                    int q1 = input.nextInt();

                    if (e == 1)
                        total += 3.49 * q1;

                    else if (e == 2)
                        total += 4.59 * q1;

                    break;

                case 2:

                    System.out.println("1. Rice Cracker - $0.79");
                    System.out.println("2. No-Salt Fries - $0.69");

                    System.out.print("Select item: ");
                    int s = input.nextInt();

                    System.out.print("Quantity: ");
                    int q2 = input.nextInt();

                    if (s == 1)
                        total += 0.79 * q2;

                    else if (s == 2)
                        total += 0.69 * q2;

                    break;

                case 3:

                    System.out.println("1. Cafe Mocha - $1.99");
                    System.out.println("2. Espresso - $2.49");

                    System.out.print("Select item: ");
                    int d = input.nextInt();

                    System.out.print("Quantity: ");
                    int q3 = input.nextInt();

                    if (d == 1)
                        total += 1.99 * q3;

                    else if (d == 2)
                        total += 2.49 * q3;

                    break;

                case 4:

                    System.out.println("Total Bill = $" + total);
                    break;

                default:

                    System.out.println("Invalid choice");
            }

        } while (choice != 4);
    }
}

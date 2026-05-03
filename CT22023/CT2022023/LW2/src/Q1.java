public class Q1{
    public static void main(String[] args) {

        // Example values
        double A = 2;
        double B = 5;
        double C = 3;
        double X = 4;
        double Y = 2;
        double radius = 7;

        // a. The square root of B² + 4AC
        double resultA = Math.sqrt(B * B + 4 * A * C);

        // b. The square root of X + 4Y³
        double resultB = Math.sqrt(X + 4 * Math.pow(Y, 3));

        // c. The cube root of the product of X and Y
        double resultC = Math.cbrt(X * Y);

        // d. The area of a circle
        double area = Math.PI * radius * radius;

        // Display results
        System.out.println("a. Square root of B² + 4AC = " + resultA);
        System.out.println("b. Square root of X + 4Y³ = " + resultB);
        System.out.println("c. Cube root of X * Y = " + resultC);
        System.out.println("d. Area of circle = " + area);
    }
}
import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int gcd = findGCD(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}

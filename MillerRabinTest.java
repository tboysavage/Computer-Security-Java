/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hussain
 */
import java.util.Scanner;

public class MillerRabinTest {

    // Returns (a^b) % m
    static int power(int a, int b, int m) {
        int result = 1;
        a = a % m;
        while (b > 0) {
            if (b % 2 == 1)
                result = (result * a) % m;
            b = b / 2;
            a = (a * a) % m;
        }
        return result;
    }

    // Returns true if n is probably prime, false if it's composite
    static boolean millerRabinTest(int n, int d) {
        int a = 2 + (int)(Math.random() % (n - 4));
        int x = power(a, d, n);

        if (x == 1 || x == n - 1)
            return true;

        while (d != n - 1) {
            x = (x * x) % n;
            d *= 2;

            if (x == 1)
                return false;
            if (x == n - 1)
                return true;
        }

        return false;
    }

    // Returns true if n is probably prime, false if it's composite
    static boolean isPrime(int n, int k) {
        if (n <= 1 || n == 4)
            return false;
        if (n <= 3)
            return true;

        int d = n - 1;
        while (d % 2 == 0)
            d /= 2;

        for (int i = 0; i < k; i++)
            if (!millerRabinTest(n, d))
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int n = scanner.nextInt();

        if (isPrime(n, 5))
            System.out.println(n + " is probably prime.");
        else
            System.out.println(n + " is composite.");
    }
}


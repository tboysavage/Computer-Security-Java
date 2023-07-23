/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hussain
 */
import java.util.Scanner;

public class ExtendedEuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int[] result = extendedEuclideanAlgorithm(a, b);
        System.out.println("GCD: " + result[0]);
        System.out.println("x: " + result[1]);
        System.out.println("y: " + result[2]);
    }

    public static int[] extendedEuclideanAlgorithm(int a, int b) {
        if (b == 0) {
            int[] result = { a, 1, 0 };
            return result;
        }

        int[] temp = extendedEuclideanAlgorithm(b, a % b);
        int gcd = temp[0];
        int x = temp[2];
        int y = temp[1] - (a / b) * temp[2];
        int[] result = { gcd, x, y };
        return result;
    }
}


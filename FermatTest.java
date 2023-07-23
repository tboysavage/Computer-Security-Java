/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hussain
 */
//import  EuclideanAlgorithm.findGCD;
import java.util.Scanner;
import java.math.BigInteger;

public class FermatTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check primality: ");
        int n = scanner.nextInt();

        boolean isPrime = fermatPrimalityTest(n);
        if (isPrime) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }
    }

    public static boolean fermatPrimalityTest(int n) {
        if (n <= 1) {
            return false;
        }

        for (int a = 5; a < n ; a++) {
            int gcd=EuclideanAlgorithm.findGCD(a,n);
            if (gcd != 1)
                return false;
            int d=(int)Math.pow((double)a,(double) n-1)%n;
            System.out.println("d= "+d);
            if ((int)d != 1)
                return false;
        }
        return true;

        
    }
    
}


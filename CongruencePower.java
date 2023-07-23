/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hussain
 */
import java.util.Scanner;

public class CongruencePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the base, exponent, and modulus
        System.out.print("Enter the base: ");
        int base = input.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();
        System.out.print("Enter the modulus: ");
        int modulus = input.nextInt();

        // Compute the power using congruences
        

        // Output the result
        int result=fastComputations(base,exponent,modulus);
        System.out.println("The result is: " + result);
    }
    
    public static int fastComputations(int base,int exponent, int modulus){
    int result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }
            base = (base * base) % modulus;
            exponent /= 2;
        }
        return result;
    }
}


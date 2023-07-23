/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hussain
 */
import java.math.BigInteger;

public class RSANumbers {
    public static void main(String[] args) {
        // Step 1: Generate two prime numbers
        int p = 3;
        int q = 11;

        // Step 2: Calculate n and phi
        int n = p * q;
        int phi = (p - 1) * (q - 1);

        // Step 3: Choose a small e such that 1 < e < phi and e is coprime to phi
        int e = 7;

        // Step 4: Calculate d, the modular multiplicative inverse of e modulo phi
        BigInteger d = BigInteger.valueOf(e).modInverse(BigInteger.valueOf(phi));

        // Step 5: Encrypt a message
        int message = 2;
        BigInteger ciphertext = BigInteger.valueOf(message).modPow(BigInteger.valueOf(e), BigInteger.valueOf(n));
        System.out.println("Ciphertext: " + ciphertext);

        // Step 6: Decrypt the ciphertext
        BigInteger plaintext = ciphertext.modPow(d, BigInteger.valueOf(n));
        System.out.println("Plaintext: " + plaintext);
    }
}

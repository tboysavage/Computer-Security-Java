import java.math.BigInteger;

public class ChineseRemainderTheorem {

    public static BigInteger chineseRemainder(BigInteger[] m, BigInteger[] a) {


        BigInteger M = BigInteger.ONE;
        for (int i = 0; i < m.length; i++) {
            M = M.multiply(m[i]);
        }

        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < m.length; i++) {
            BigInteger Mi = M.divide(m[i]);
            result = result.add(a[i].multiply(Mi).multiply(Mi.modInverse(m[i])));
        }

        return result.mod(M);
    }

    public static void main(String[] args) {
        BigInteger[] m = { BigInteger.valueOf(3), BigInteger.valueOf(5), BigInteger.valueOf(7) };
        BigInteger[] a = { BigInteger.valueOf(2), BigInteger.valueOf(3), BigInteger.valueOf(2) };
        BigInteger result = chineseRemainder(m, a);
        System.out.println(result);
    }
}


import java.util.Scanner;
import java.math.BigInteger;

public class Java_Datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            BigInteger n = sc.nextBigInteger();
            boolean fits = false;

            System.out.println(n + (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0
                    ? " can be fitted in:" : " can't be fitted anywhere."));

            if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 &&
                n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {

                if (n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0) {
                    System.out.println("* byte");
                }

                if (n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0) {
                    System.out.println("* short");
                }

                if (n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0 &&
                    n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0) {
                    System.out.println("* int");
                }

                System.out.println("* long");
            }
        }

        sc.close();
    }
}

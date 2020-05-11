import java.util.Scanner;
import java.lang.Math;
public class file {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        long a = 1, b = 1;
        long[] v = new long[30];
        int j = -1;
        for (long i = 0; i < Math.pow(10, 17);) {
            i = a + b;
            if (i % 2 == 0)
                v[++j] = i;
            a = b;
            b = i;
        }
        int t = input.nextInt();
        for (j = 0; j < t; j++) {
            long n = input.nextLong(), s = 0;
            for (int k = 0; v[k] <= n; k++)
                s += v[k];
            System.out.println(s);
        }
    }
}

/*
 * Explanation: Firstly found all the even fibonacci numbers and stored in an
 * array v[].Then summation of all elements of array until that input number.
 */
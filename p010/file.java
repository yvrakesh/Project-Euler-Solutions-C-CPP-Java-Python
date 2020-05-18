import java.util.Scanner;
public class file{
    public static boolean isPrime(int n){
        for(int i=3;i<=Math.sqrt(n);i+=2)
            if(n%i==0)
                return false;
        return true;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        long [] a = new long[2000001];
        a[0]=0;a[1]=0;a[2]=2;
        for(int i=3;i<2000001;i+=2){
            if(isPrime(i))
                a[i] = i;
            else
                a[i] = 0;
            a[i+1] = 0;
        }
        for(int i=0;i<2000000;i++)
            a[i+1] += a[i];
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            System.out.println(a[input.nextInt()]);
        }
    }
}
/*Explanation:
                Firstly store each element of index i to i if it is Prime 0 otherwise.
                Then perform cumulative sum over and replace the entries with its cumulative sum.
                Thus each element at a particular index n states sum of all primes less than or equal to it.
*/
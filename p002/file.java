import java.util.Scanner;
import java.lang.Math;
public class file{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        long a=1,b=2;
        long[] v = new long[30];
        v[0] = 2;
        int j=0;
        for(long i=3;i<Math.pow(10,17);){
            i=a+b;
            if(i%2==0)
                v[++j] = i;
            a=b;
            b=i;
        }
        int t = input.nextInt();
        for(j=0;j<t;j++){
            long n = input.nextLong();
            long s=0;
            for(int k=0;v[k]<=n;k++)
                s += v[k];
            System.out.println(s);
        }
    }
}
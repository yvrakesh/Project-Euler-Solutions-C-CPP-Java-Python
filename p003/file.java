import java.util.Scanner;
public class file{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        long t = input.nextInt();
        for(int i=0;i<t;i++){
            long n = input.nextLong(),ans=1;
            for(long j=2;j*j<=n;j++){
                while(n%j==0){
                    ans=j;
                    n /= j;
                }
            }
            if (n>1)
                ans=n;
            System.out.println(ans);
        }
    }
}
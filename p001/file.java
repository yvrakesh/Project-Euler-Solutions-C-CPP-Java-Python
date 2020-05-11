import java.util.Scanner;
public class file{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            long n = input.nextInt();
            n--;
            long a=n/3,b=n/5,c=n/15;
            System.out.println(((a*(a+1)*3-c*(c+1)*15+b*(b+1)*5)>>1));
        }
    }
}


/*EXPLANATION:
    No. of numbers that are multiples of k are floor(n/k)
    The numbers are k,2k,3k,.....(n/k)*k
    Hence their sum is k+2*k+3*k+....+(n/k)*k
    k(1+2+3+.....(n/k))
    k*((n/k)*(n/k+1))/2
    (k*(n/k)*(n/k+1))>>1    #right shift
*/
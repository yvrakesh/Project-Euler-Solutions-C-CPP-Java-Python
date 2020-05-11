import java.util.Scanner;
public class file {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int n = input.nextInt();
            long t1 = n*(n+1);
            long t2 = t1*(3*n*n-n-2);
            System.out.println(t2/12);
        }
    }
}

/* Explanation:
    Sum of numbers from 1 to n is n*(n+1)/2
    Sum of squares of numbers from 1 to n i.e 1^2+2^2+...+n^2 is n*(n+1)*(2n+1)/6
    n*(n+1)*(2n+1)/6-n*n*(n+1)*(n+1)/4
    solving you get n*(n+1)*(3*n*n-n-2)/12
*/
import java.util.Scanner;
public class file{
    static int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int n = input.nextInt();
            int r = 1;
            for(int j=2;j<=n;j++)
                r *= j/gcd(r,j);
            System.out.println(r);
        }
    }
}

/*  Explanation:
        The smallest number that is divisible by a set of numbers is called Least Common Multiple(LCM) of those numbers.
        LCM(a,b) = a*b/GCD(a,b)
        LCM(a,b,c,d,e,...z) = LCM(LCM(LCM(LCM.....(LCM(a,b),c),d)....))
        Please note that r = r*(i/gcd(r,i)) is different from r = (r*i)/gcd(r,i) because r,i are very huge that their product may change the data type.
*/
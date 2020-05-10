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
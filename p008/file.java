import java.util.Scanner;
public class file {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int m=0;m<t;m++){
            int n = input.nextInt(),k = input.nextInt();
            String l = input.nextLine();
            String s = input.nextLine();
            int[] a = new int[n];
            for(int i=0;i<n;i++)
                a[i] = s.charAt(i)-'0';
            long req = 0;
            for(int i=0;i<n-k;i++){
                long num = 1;
                for(int j=0;j<k;j++)
                    num *= a[i+j];
                    if(req<num)
                        req = num;
            }
            System.out.println(req);
        }
    }    
}
/*Explanation:
    As the input number is as big as 1000 digit there is no data type to store that as an integer.
    So we take the whole input as string and take each character and convert it to integer.
    Then two loops for finding product of adjacent k digits and finding max of them
*/
import java.util.Scanner;
public class file{
    static long sq_root(long n){
        long f=1,l=n,ans=0;    
        while(f<=l){         
            long mid = f+(l-f)/2;
            long t = mid*mid;
            if(t == n) 
                return mid;
            if(t<n){ 
                f = mid+1; 
                ans = mid; 
            }  
            else
                l = mid-1;         
        } 
        return ans; 
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0;i<t;i++){
            int n = input.nextInt(),flag = 0;
            for(int c = (int)0.414*n;c<n/2;c++){
                long t1 = c*c-n*n+2*n*c;
                int t2 = (int)sq_root(t1);
                if(t2*t2 == t1){
                    int b = (int)(n+t2-c)/2;
                    int a = (int)n-b-c;
                    System.out.println(a*b*c);
                    flag = 1;
                    break;
                }
            }
                if(flag==0)
                    System.out.println(-1);
        }
    }
}
/*  Explanation:
        a+b+c = n
        a+b = n-c
        (a+b)² = (n-c)²
        a²+b²+2ab = n²+c²-2nc
        c²+2ab = n²+c²-2nc  ( a²+b² = c²)
        n² = 2ab+2nc
        n² = 2(ab+nc)
        n² is a 2 multiple  =>  n is a 2 multiple.

        Hence n is always an even number


        from above n² = 2ab+2nc
                    n²-2nc = 2ab
                    2nc-n² = -2ab
                    2nc+c²-n² = c²-2ab
                    2nc+c²-n² = a²+b²-2ab
                    2nc+c²-n² = (a-b)²
                    
        Thus 2*n*c+c²-n² must be a perfect square.

        From above 2nc+c²-n² = (a-b)²
                   2nc+c²-n²>0
                   c²+2nc-n²>0
                   c²+2nc>n²
                   c²+2nc+n²>2*n²
                   (c+n)²>2*n²
                   c+n>√2*n
                   c>(√2-1)*n
        
        Hence c > (√2-1)*n

        (a-b)² = c²-n²+2nc
        (a-b)² = t1
        a-b = t2
        a+b = n-c

        Solving both    b = (n-c-t2)/2
        a = n-c-b
*/
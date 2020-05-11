import java.util.Scanner;
public class file{
    static int sq_root(int n){
        int f=1,l=n,ans=0;    
        while(f<=l){         
            int mid = (l-f)/2+f;
            int t = mid*mid;
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
    static int isPrime(int n){
        int t = sq_root(n);
        for(int i=3;i<=t;i+=2)
            if(n%i==0)
                return 0;
        return 1;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[] a = new int[10002];
        a[0] = 2;
        int j=0;
        for(int i=3;;i+=2){
            if(j>10000)
                break;
            if(isPrime(i)==1)
                a[++j] = i;
        }
        for(int i=0;i<t;i++){
            int n = input.nextInt();
            System.out.println(a[n-1]);
        }
    }
}

/*Explanation:
    Firstly find all prime numbers and store it in an array a.
    Optimizing isPrime func:
        if n%i==0 then n%(n/i) == 0 or n%i!=0 then n%(n/i)!=0
        So its enough iterating from 2 to sqrt(n).
        Except 2 no prime number is even hence we can check only odd numbers whether if prime.
        Odd numbers never have even factors.
        Hence enough iterating from 3 to sqrt(n) with increment 2
    Optimizing sq_root func:
        Here i used binary search technique to find sq_root. Because there are two things common in them.
        Binary search is used for increasingly sorted numbers and here iteration is also from 1 to root n(i.e i*i<=n) which is increasing series.
        In case you still didn't understand sq_root func then refer binary search algo in geeksforgeeks.
*/ 
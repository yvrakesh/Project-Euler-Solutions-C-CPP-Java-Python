#include<iostream>
using namespace std;
int sq_root(int n){
    int f=1,l=n,ans;    
    while(f<=l){         
        int mid = (l-f)/2+f;
        if(mid*mid == n) 
            return mid;
        if (mid*mid<n){ 
            f = mid+1; 
            ans = mid; 
        }  
        else
            l = mid-1;         
    } 
    return ans; 
}
int isPrime(int n){
    if(n%2==0)
        return 0;
    for(int i=3;i<=sq_root(n);i+=2)
        if(n%i==0)
            return 0;
    return 1;
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    int a[10001];
    a[0] = 2;
    int j=0;
    for(int i=3;;i++){
        if(j>10000)
            break;
        if(isPrime(i))
            a[++j] = i;
    }
    for(int i=0;i<t;i++){
        int n;
        cin>>n;
        cout<<a[n-1]<<endl;
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
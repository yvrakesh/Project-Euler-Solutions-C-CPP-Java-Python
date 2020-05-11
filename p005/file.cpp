#include<iostream>
using namespace std;
int gcd(int a,int b){ 
    if(a==0) 
        return b; 
    return gcd(b % a, a); 
}
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int r=1,n;
        cin>>n;
        for(int i=2;i<=n;i++)
            r *= i/gcd(i,r);
        cout<<r<<endl;
    }
    return 0;
}

/*  Explanation:
        The smallest number that is divisible by a set of numbers is called Least Common Multiple(LCM) of those numbers.
        LCM(a,b) = a*b/GCD(a,b)
        LCM(a,b,c,d,e,...z) = LCM(LCM(LCM(LCM.....(LCM(a,b),c),d)....))
        Please note that r = r*(i/gcd(r,i)) is different from r = (r*i)/gcd(r,i) because r,i are very huge that their product may change the data type.
*/
#include<stdio.h>
#include<math.h>
typedef long long int ll;
int main(){
    ll a=1,b=2;
    ll v[30];
    v[0] = 2;
    int j=0;
    for(ll i=3;i<pow(10,17);){
        i=a+b;
        if(i%2==0)
            v[++j] = i;
        a=b;
        b=i;
    }
    int t;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
        ll sum=0,n;
        scanf("%lld",&n);
        for(int i=0;v[i]<=n;i++)
            sum += v[i];
        printf("%lld\n",sum);
    }
    return 0;
}


/*
    Explanation:
        Firstly found all the even fibonacci numbers and stored in an array v[].Then
    summation of all elements of array until that input number.
*/
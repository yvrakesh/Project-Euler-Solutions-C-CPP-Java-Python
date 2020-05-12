#include<stdio.h>
typedef long long int ll;
int main(){
    int t;
    scanf("%d",&t);
    for(int i=0;i<t;i++){
        int n,k;
        scanf("%d %d",&n,&k);
        int a[n];
        char ch;
        scanf("%c",&ch);
        for(int i=0;i<n;i++){
            scanf("%c",&ch);
            a[i] = ch-'0';
        }
        ll req = 0;
        for(int i=0;i<n-k;i++){
            ll num = 1;
            for(int j=0;j<k;j++)
                num *= a[i+j];
            if(req<num)
                req = num;
        }
        printf("%lld\n",req);
    }
    return 0;
}
/*Explanation:
    As the input number is as big as 1000 digit there is no data type to store that as an integer.
    So we take the whole input as string and take each character and convert it to integer.
    Then two loops for finding product of adjacent k digits and finding max of them
*/
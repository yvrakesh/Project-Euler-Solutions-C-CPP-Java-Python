#include<stdio.h>
typedef long long int ll;
int main(){
	int t;
	scanf("%d",&t);
	for(int i=0;i<t;i++){
		ll n,ans;
		scanf("%lld",&n);
		for(ll j=2;j*j<=n;j++){
			while(n%j==0){
				ans=j;
				n /= j;
			}
		}
		if (n>1)
            ans=n;
		printf("%lld\n",ans);
	}  
    return 0;
}
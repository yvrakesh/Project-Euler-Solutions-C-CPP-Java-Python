#include<iostream>
using namespace std;
typedef long long int ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
	int t;
	cin>>t;
	for(int i=0;i<t;i++){
		ll n,ans=1;
		cin>>n;
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
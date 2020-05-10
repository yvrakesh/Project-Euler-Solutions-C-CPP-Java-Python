#include<iostream>
#include<vector>
#include<cmath>
using namespace std;
typedef long long int ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll a=1,b=2;
    vector<ll> v;
    v.push_back(2);
    for(ll i=3;i<pow(10,17);){
        i=a+b;
        if(i%2==0)
            v.push_back(i);
        a=b;
        b=i;
    }
    int t;
    cin>>t;
    ll sum;
    for(int i=0;i<t;i++){
        sum=0;
        ll n;
        cin>>n;
        for(auto j=v.begin();j!=v.end() && (*j)<=n ;j++)
            sum += *j;
        cout<<sum<<endl;
    }
    return 0;
}
#include<iostream>
using namespace std;
typedef long long int ll;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        int n,k;
        cin>>n>>k;
        int a[n];
        char ch;
        for(int i=0;i<n;i++){
            cin>>ch;
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
        cout<<req<<endl;
    }
    return 0;
}
/*Explanation:
    As the input number is as big as 1000 digit there is no data type to store that as an integer.
    So we take the whole input as string and take each character and convert it to integer.
    Then two loops for finding product of adjacent k digits and finding max of them
*/
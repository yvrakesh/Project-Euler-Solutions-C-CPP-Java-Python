#include<iostream>
using namespace std;
int reverse(int num){
    int temp = num,rev= 0;
    for(;temp!=0;temp/=10)
        rev = rev*10+temp%10;
    return rev;
}
bool isPallendrome(int num){
    if(num==reverse(num))
        return 1;
    return 0;
}
int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
        ios_base::sync_with_stdio(false);
        cin.tie(NULL);
        int n;
        cin>>n;
        int temp=0;
        for(int i=990;i>99;i-=11){
            for(int j=999;j>99;j--){
                int req = i*j;
                if(req<n && isPallendrome(req)){
                    if(req>temp)
                        temp = req;
                    break;
                }
            }
        }
        cout<<temp<<endl;
    }
    return 0;
}

/*  Explanation:
        suppose abccba be the pallendrome number(Remember input constrains are for six digit numbers)
        a*100000+b*10000+c*1000+c*100+b*10+a
        a*100001+b*10010+c*1100
        11*(a*9091+b*910+c*100).Hence a pallendrome number must be 11 multiple
        Question is largest pallendrome number i.e product of two 3-digit numbers
        Hence either of the two numbers is a 11 multiple. Hence one loop from 990 to 99 with 11 units gap.
        Other number from 999 to 99 with 1 gap.
*/
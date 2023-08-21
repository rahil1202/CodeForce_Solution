#include<iostream>
using namespace std;
int main(){
int t; cin>>t;
while(t--){
int n,sum=0;cin>>n; int a[n];
for(int &i:a){
cin>>i; sum+=i;
}
sum%2==0?cout<<"YES\n":cout<<"NO\n";
}
}

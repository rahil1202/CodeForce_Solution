#include<bits/stdc++.h>
using namespace std;
int main(){
int tes,nij;
cin>>tes;
while(tes--){
int add=0;
cin>>nij;
int a[nij];
for (int i=0;i<nij;i++){
cin>>a[i];
if (a[i]==i+1)add++;}
cout<<(add+1)/2<<endl;}}

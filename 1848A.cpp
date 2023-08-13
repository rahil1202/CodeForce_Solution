#include<bits/stdc++.h>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t--){
		int n,m,k;
		int xx,xy;
		string ans="YES\n";
		cin>>n>>m>>k;
		int wx,wy;
		cin>>wx>>wy;
		for(int i=0;i<k;i++){
			cin>>xx>>xy;
			if((wx+wy)%2==(xx+xy)%2){
				ans="NO\n";
			}
		}
		cout<<ans;
	}
}

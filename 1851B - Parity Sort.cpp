#include<bits/stdc++.h>
using namespace std;
main(){
	int t;
	cin>>t;
	while(t--){
	    
		int n; cin>>n; 
		int a[n], b[n]; 
		string ans="YES";
		for(int i=0;i<n;i++) 
		cin>>a[i], b[i]=a[i];
		sort(a, a+n);
		for(int i=0;i<n;i++) 
		if(a[i]%2 != b[i]%2)
		{
			ans="NO";
			break;
		}
		cout<<ans<<endl;
	}
}

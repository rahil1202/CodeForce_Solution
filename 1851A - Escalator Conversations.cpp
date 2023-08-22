// 1851A - Escalator Conversations

#include<bits/stdc++.h>
using namespace std;

int main()
{
	int t,n,m,h,k,i,s;
	cin>>t;
	while(t--)
	{
		cin>>n>>m>>k>>h;
		int a;
		s=0;
		for(i=0;i<n;i++)
		{
			cin>>a;
			if(h!=a && abs(h-a)%k==0 && abs(h-a)<=(m-1)*k)
				s++;
		}
		cout<<s<<endl;
	}
	return 0;
}

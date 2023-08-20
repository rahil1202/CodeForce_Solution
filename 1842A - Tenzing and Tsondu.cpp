#include<cstdio>
#define ll long long
int main()
{
	int t;scanf("%d",&t);
	while(t--)
	{
		int n,m;scanf("%d %d",&n,&m);
		ll a=0,b=0;
		for(int i=1;i<=n;i++)
		{
			int x;scanf("%d",&x);
			a+=x;
		}
		for(int i=1;i<=m;i++)
		{
			int x;scanf("%d",&x);
			b+=x;
		}
		if(a==b)printf("Draw\n");
		else if(a>b)printf("Tsondu\n");
		else printf("Tenzing\n");
	}
	return 0;
}
   	   		   		    	 	 			  	 		

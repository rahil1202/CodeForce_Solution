#include<bits/stdc++.h>
 
 #define int long long int
 #define F first
 #define S second
 #define pb push_back
 #define que_max priority_queue<int>
 #define que_min priority_queue<int,vector<int>,greater<int>>;
  #define endl "\n"
  using namespace std;
  
  int32_t main()
  {
  #ifndef ONLINE_JUDGE
      freopen("input.txt","r",stdin);
      freopen("output.txt","w",stdout);
  #endif
  
 
 int32_t t;
 cin>>t;
 while(t--)
 {
    int a,b,c;
    cin>>a>>b>>c;

    int x1=a+(c/2)+c%2;
    int y1=b+(c/2);
    if(x1>y1)
    {
        cout<<"First"<<endl;
    }else
    {
        cout<<"Second"<<endl;
    }


 }
 
      return 0;
  }

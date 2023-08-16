#include <bits/stdc++.h>
using namespace std;
#define ll long long int
#define vl vector<ll>


void solve(){
    ll n,i,j,x,y;
    cin>>n;
    vl vis(n+1,0);
    cout<<"1 ";
    unordered_map<int,int>mp;
    mp[1]=1;
    for(i=2;i<=n;i++) {
        if(mp[i])continue;
        j=i;
        while(j<=n){
            if(!mp[j]){
                cout<<j<<" ";
                mp[j]=1;
                j*=2;
            }
        }
    }
    cout<<endl;
}
 
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    ll t;
    cin>>t;
    while(t--){
       solve();
    }
    return 0;
}

CF - C

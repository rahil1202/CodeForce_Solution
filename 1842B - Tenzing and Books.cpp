#include<cstdio>
using namespace std;
const int o=1e5+10;
int T,n,X,s,a[o];
inline void slv(){
	for(int i=1;i<=n;++i) scanf("%d",&a[i]);
	for(int i=1;i<=n&&((a[i]&X)==a[i]);++i) s|=a[i];
}
int main(){
	for(scanf("%d",&T);T--;printf((s==X)?"Yes\n":"No\n")){
		scanf("%d%d",&n,&X);s=0;
		slv();slv();slv();
	}
	return 0;
}

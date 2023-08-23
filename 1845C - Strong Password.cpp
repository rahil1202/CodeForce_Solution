#include <iostream>
using namespace std;
int main() {
	int t;cin>>t;
	string s,l,r;
	while(t--){
		int m;
		cin>>s>>m>>l>>r;
		size_t x=0;
		for(int i=0; i<m; ++i) {
			size_t best=0;
			for(char j=l[i]; j<=r[i]; ++j) {
				size_t d = s.find_first_of(j, x);
				best = max(best,d);
			}
			x = best;
			if (x != string::npos) ++x;
		}
		cout<<(x==string::npos?"YES":"NO")<<'\n';
	}
}

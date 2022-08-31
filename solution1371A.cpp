#include <bits/stdc++.h>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int ans(0);
        int n;
        cin >> n;
        if (n % 2 != 0)
            ans = (n + 1) / 2;
        else
            ans = n / 2;
        cout << ans << endl;
    }
    return 0;
}
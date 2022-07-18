#include <bits/stdc++.h>
using namespace std;
int main()
{
    int cases;
    scanf("%d", &cases);
    while (cases-- > 0)
    {
        int n;
        scanf("%d", &n);
        int sum(0), ans(0);
        for (int i = 0; i < n; i++)
        {
            int t;
            scanf("%d", &t);
            sum += t;
        }
        ans = sum / n;
        if (ans < 0)
            cout << 1 << endl;
        else if (sum == n && ans == 1)
            cout << 0 << endl;
        else
        {
            ans = sum - n;
            cout << ans << endl;
        }
    }
    return 0;
}
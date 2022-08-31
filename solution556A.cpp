#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    string str;
    cin >> str;
    int zero = 0, one = 0;
    for (int i = 0; i < n; ++i)
    {
        if (str[i] == '1')
        {
            ++one;
        }
        else
            ++zero;

        // cout<<n<<endl;
        // else continue;
    }
    int ans = 2 * min(zero, one);
    cout << n - ans << endl;
    return 0;
}
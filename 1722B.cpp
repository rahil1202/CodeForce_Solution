#include <bits/stdc++.h>
using namespace std;
map<int, int> mp;

int main()

{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        string s, c;
        cin >> s >> c;
        for (int i = 0; i < n; i++)
        {
            if (s[i] == 'G')
                s[i] = 'B';
            if (c[i] == 'G')
                c[i] = 'B';
        }
        if (s == c)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }

    return 0;
}
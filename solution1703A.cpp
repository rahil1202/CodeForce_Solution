#include <bits/stdc++.h>
using namespace std;
main()
{
    int t;
    cin >> t;
    while (t--)
    {
        string su;
        cin >> su;
        transform(su.begin(), su.end(), su.begin(), ::toupper);

        if (su == "YES")
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
}
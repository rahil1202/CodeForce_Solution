#include <bits/stdc++.h>
using namespace std;
main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n, flag(0);
        cin >> n;
        string str;
        cin >> str;
        if (n != 5)
            flag = 0;
        else
        {
            if (str.find('T') < str.length())
                ++flag;
            if (str.find('i') < str.length())
                ++flag;
            if (str.find('m') < str.length())
                ++flag;
            if (str.find('u') < str.length())
                ++flag;
            if (str.find('r') < str.length())
                ++flag;
        }
        if (flag == 5)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
}
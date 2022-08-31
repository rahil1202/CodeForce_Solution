#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int ch(0), bi(0), ba(0);
    int k = 1;
    for (int i = 0; i < n; ++i)
    {
        int x;
        cin >> x;
        if (k == 1)
        {
            ch += x;
            k++;
        }
        else if (k == 2)
        {
            bi += x;
            k++;
        }
        else if (k == 3)
        {
            ba += x;
            k = 1;
        }
    }
    if (ch > bi && ch > ba)
        cout << "chest" << endl;
    else if (bi > ch & bi > ba)
        cout << "biceps" << endl;
    else
        cout << "back" << endl;

    return 0;
}
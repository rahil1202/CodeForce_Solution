#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    int a[120];
    while (t--)
    {
        int n;
        cin >> n;
        for (int i = 0; i < n; i++)
            cin >> a[i];
        int k = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] == a[i + 1])
                k = a[i];
            else
                continue;
        }
        for (int i = 0; i < n; i++)
        {
            if (a[i] != k)
                cout << i + 1 << endl;
            else
                continue;
        }
    }
    return 0;
}

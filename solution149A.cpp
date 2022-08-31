#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n, count(0);
    int arr[12];
    cin >> n;
    for (int i = 0; i < 12; ++i)
    {
        cin >> arr[i];
    }
    sort(arr, arr + 12);
    if (n == 0)
        cout << 0 << endl;
    else
    {

        for (int i = 11; i >= 0; --i)
        {
            n -= arr[i];
            count++;
            if (n <= 0)
                break;
            else if (i == 0)
                count = -1;

            else
                continue;
        }

        cout << count << endl;
    }
    return 0;
}
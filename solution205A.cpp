#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    int ans(0);
    cin >> n;
    int arr[n];
    int temp[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
        temp[i] = arr[i];
    }
    sort(temp, temp + n);

    if (temp[0] == temp[1])
        cout << "Still Rozdil";
    else
    {
        for (int i = 0; i < n; i++)
        {
            if (temp[0] == arr[i])
            {
                ans = i + 1;
                break;
            }
        }
        cout << ans << endl;
    }

    return 0;
}
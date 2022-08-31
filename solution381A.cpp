// #include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; ++i)
    {
        cin >> arr[i];
    }
    sort(arr, arr + n, greater<int>());
    int ser(0), dem(0);
    for (int i = 0; i < n; ++i)
    {
        if ((i + 1) % 2 != 0)
            ser += arr[i];
        else
            dem += arr[i];
    }
    cout << ser << " " << dem;
    return 0;
}
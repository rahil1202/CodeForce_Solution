#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n, t, f(0), z(0);
    scanf("%d", &n);

    // int arr[n];
    for (int i = 0; i < n; ++i)
    {
        // scanf("%d", &arr[i]);
        scanf("%d", &t);
        if (t == 0)
            ++z;
        else if (t == 5)
            ++f;
    }
    if (z == 0)
        printf("-1\n");
    else if (f < 9)
        // cout << 0 << endl;
        printf("0\n");

    else
    {
        f -= f % 9;
        for (int i = 0; i < f; i++)
            printf("5");
        for (int i = 0; i < z; i++)
            printf("0");
    }

    return 0;
}
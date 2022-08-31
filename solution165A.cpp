#include <iostream>
#include <cstdio>
using namespace std;
int main()
{

    int n, x[222], y[222], ans = 0;
    bool a, b, c, d;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        scanf("%d%d", &x[i], &y[i]);
    }
    for (int i = 0; i < n; i++)
    {

        a = 0, b = 0, c = 0, d = 0;
        for (int j = 0; j < n; j++)
        {
            if (x[i] > x[j] && y[i] == y[j])
                a = 1;
            if (x[i] < x[j] && y[i] == y[j])
                b = 1;
            if (x[i] == x[j] && y[i] < y[j])
                c = 1;
            if (x[i] == x[j] && y[i] > y[j])
                d = 1;
        }
        if (a == 1 && b == 1 && c == 1 && d == 1)
            ans++;
    }
    cout << ans << endl;
    return 0;
}

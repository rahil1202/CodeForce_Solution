#include <iostream>
using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t-- > 0)
    {
        int a, b;
        cin >> a >> b;
        if (a == b)
        {
            cout << 0 << '\n';
        }

        else if ((a > b && (a - b) % 2 == 0) || (a < b && (a - b) % 2 != 0))
        {
            cout << 1 << '\n';
        }
        else
        {
            cout << 2 << '\n';
        }
    }
    return 0;
}
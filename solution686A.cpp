#include <iostream>
using namespace std;
int main()
{
    int t;
    long long pck;
    cin >> t >> pck;
    int distress(0);
    while (t--)
    {
        char ch;
        long long x;
        cin >> ch >> x;
        if (ch == '+')
            pck += x;
        else if (ch == '-')
        {
            if (x > pck)
                ++distress;
            else
                pck -= x;
        }
    }
    cout << pck << " " << distress;
    return 0;
}
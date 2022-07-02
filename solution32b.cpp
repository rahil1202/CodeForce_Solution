#include <iostream>
using namespace std;
int main()
{
    string ip;
    cin >> ip;
    // getline(cin, ip);
    int len = ip.length();
    for (int i = 0; i < len; i++)
    {
        if (ip[i] == '-')
        {
            if (ip[i + 1] == '.')
                cout << 1;
            else if (ip[i + 1] == '-')
                cout << 2;
            i++;
        }
        else if (ip[i] == '.')
            cout << 0;
        else
            continue;
    }

    return 0;
}
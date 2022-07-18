#include <bits/stdc++.h>
using namespace std;
int main()
{
    int test;
    scanf("%d", &test);
    while (test-- > 0)
    {
        int s1, s2, s3, s4;
        cin >> s1 >> s2 >> s3 >> s4;
        int arr[4] = {s1, s2, s3, s4};
        sort(arr, arr + 4);
        int temp1 = max(s1, s2);
        int temp2 = max(s3, s4);
        if (temp1 == arr[2] && temp2 == arr[3] || temp1 == arr[3] && temp2 == arr[2])
            printf("YES\n");
        else
            printf("NO\n");

        // cout << temp1 << " " << temp2;
        // cout << arr[3] << " " << arr[2];
    }
    return 0;
}

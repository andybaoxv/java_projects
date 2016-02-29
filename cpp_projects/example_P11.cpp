#include<iostream>
using namespace std;

int main()
{
    int sum = 0, val = 1;
    // keep executing the while as long as val is less than or equal to 10
    while (val <= 10)
    {
        sum += val;
        ++val;
    }
    cout << "Sum of 1 to 10 inclusive is " << sum << endl;

    int sum2 = 0;
    for (int i = 50; i <= 100; i++)
        sum2 += i;
    cout << "Sum of 50 to 100 inclusive is " << sum2 << endl;

    return 0;
}

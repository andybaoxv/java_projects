#include<iostream>
#include<vector>

using namespace std;

int main()
{
    /*
    string s1, s2;
    cin >> s1 >> s2;
    cout << "s1 = " << s1 << endl;
    cout << "s2 = " << s2 << endl;
    return 0;*/
    
    /*
    string word;
    while (cin >> word)
    {
        cout << word << endl;
    }
    return 0;*/
    
    /*
    string line;
    while (getline(cin,line))
        cout << line <<endl;
    return 0;*/
    
    /*
    string s1 = "Hello";
    string s2 = "Is anybody out there";
    string s3 = s1 + s2;
    cout << "s3 = " << s3 << endl;*/

    const string hexdigits = "0123456789ABCDEF";
    cout << "Enter a serires of numbers between 0 and 15"
         << "separated by spaces. Hit ENTER when finished: " << endl;
    
    string result;
    string::size_type n;
    while (cin >> n)
      if (n < hexdigits.size())
        result += hexdigits[n];

    cout << "Your hex number is: " << result << endl;
}


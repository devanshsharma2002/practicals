#include <iostream>
using namespace std;
inline float add(float a, float b)
{
    return a + b;
}
inline float sub(float a, float b)
{
    return a - b;
}
inline float mul(float a, float b)
{
    return a * b;
}
inline float div(float a, float b)
{
    return a / b;
}
int main()
{
    float a, b;
    cout<< "Enter your numbers : "<<endl;
    cin>>a>> b;
    cout << add(a, b) << endl;
    cout << sub(a, b) << endl;
    cout << mul(a, b) << endl;
    cout << div(a, b) << endl;
}
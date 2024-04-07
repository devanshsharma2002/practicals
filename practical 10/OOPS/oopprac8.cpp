#include<iostream>
#include<conio.h>
using namespace std;
class triangle
{
int b,h,s1,s2;
public : triangle()
{
b=10;
h=5;
s1=5;
s2=15;
}
triangle(int x,int y,int p,int q)
{
b=x;
h=y;
s1=p;
s2=q;
}
triangle(triangle&ref)
{
b=ref.b;
h=ref.h;
s1=ref.s1;
s2=ref.s2;
}
~ triangle()
{
cout<<"Destructor called!"<<endl;
}
int area();
int perimeter();
};
int triangle::area()
{
cout<<"Area of triangle"<<((b*h)/2)<<endl;
return 0;
}
int triangle::perimeter()
{
cout<<"Perimeter of triangle is:"<<(2*(s1+s2))<<endl;
return 0;
}
int main()
{
triangle t1;
t1.area();
t1.perimeter();

}
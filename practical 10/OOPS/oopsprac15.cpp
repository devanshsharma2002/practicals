#include <iostream>
using namespace std;

                // One function works for all data types. This would work
               // even for user defined types if operator '>' is overloaded
template <typename T> T myMax(T x, T y)
{
	return (x > y) ? x : y;
}

int main()
{
	                                                                   // Call myMax for int
	cout << myMax<int>(12, 15) << endl;
	                                                                   // call myMax for double
	cout << myMax<double>(5.0, 7.0) << endl;
	// call myMax for char
	cout << myMax<char>('A', 'S') << endl;

	return 0;
}

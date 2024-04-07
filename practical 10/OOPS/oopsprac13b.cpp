// Program to demonstrate  
// accessing array out of bounds 
#include <iostream>
using namespace std;
 
int main() 
{ 
    int arr[] = {1,2,3,4,5}; 
    cout("arr [0] is %d\n", arr[0]); 
      
    // arr[10] is out of bound 
    cout("arr[10] is %d\n", arr[10]); 
    return 0; 
}

#include <iostream>
using namespace std;
// Factorial of a number
int fact()
{
    
    cout << "\n\n\nthis is a factorial calculator " << endl;
    cout << "enter the number for which factorial has to be found out  : ";
    int a = 0, b = 1, c = 1;
    cin >> a;
    for (int i = 1; i <= a; i++)
    {

       
        b = b * i;
        
    }
    cout << "the factorial is : " << endl;
    cout << b << endl;
    return 0;
}
// sum of digits in array of 10
int arrsum()
{
    
    int a = 0, arr[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int i = 0; i < 10; i++)
    {
        a = arr[i] + a;
    }

    cout << "\n\n the sum is : " << a << endl;
    return 0;
}

// matrix addition of 3x3
int matadd()
{
    cout << "\n\n\nenter elements for matrix 1 :- " << endl;
    int arr1[3][3] = {};
    for (int i = 0; i < 3; i++)
    {

        for (int j = 0; j < 3; j++)
        {
            cout << "row " << i << " column " << j << " ";
            cin >> arr1[i][j];
        }
        cout << "\n";
    }

    cout << "enter elements for matrix 2 :- " << endl;
    int arr2[3][3] = {1, 2, 3, 1, 2, 3, 1, 2, 3};
    for (int i = 0; i < 3; i++)
    {

        for (int j = 0; j < 3; j++)
        {
            cout << "row " << i << " column " << j << " ";
            cin >> arr2[i][j];
        }
        cout << "\n";
    }

    int arr3[3][3] = {};

    for (int i = 0; i < 3; i++)
    {

        for (int j = 0; j < 3; j++)
        {
            arr3[i][j] = arr1[i][j] + arr2[i][j];
        }
    }

    cout << "THE MATRIX AFTER ADDITION IS : " << endl;

    for (int i = 0; i < 3; i++)
    {

        for (int j = 0; j < 3; j++)
        {
            cout << arr3[i][j] << " ";
        }
        cout << "\n";
    }
    return 0;
}
int main()
{
    cout << "THIS IS A MULTIPURPOSE \n\n"
         << endl;
    int op, cont = 0;
    cout << " - 1 \n\n"
         << endl;

    do
    {
        cout << "\n\n ENTER \n 1 FOR FACTORIAL \n 2 FOR SUM OF DIGITS IN ARRAY OF 10 \n 3 FOR MATRIX ADDITION\n" << endl;
        cin >> op;
       
        if (op>0 && op <4)
        {
            switch (op)
            {
            case 1 :{ cout<<"in 1 ";fact();break;}
            case 2 :{ cout<<"in 2 "; arrsum(); break;}
            case 3 :{ cout<<"in 3 "; matadd(); break;}
            
            default:
                break;
            }
            cout << "\n\n"<< endl;
        }
        else
        {
            cout << "GALAT INPUT MAT DAAL \n\n ";
        }
        cout << " do it once more time ? if yes give 1 as input :  ";
        cin >> cont;

    } while (cont == 1);

    cout << "\n\n\nGOOD to see you go \n\n\n";
}
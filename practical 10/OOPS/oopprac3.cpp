#include <iostream>
#include <string>
#include <cstring>

int main()
{
    // Using std::string
    std::string cppString = "Hello, ";
    cppString += "world!";

    std::cout << "Concatenation using std::string: " << cppString << std::endl;

    // Using C-style strings (cstring)
    const char *cString1 = "Hello, ";
    const char *cString2 = "world!";
    char cResult[50]; // Make sure it's large enough to hold the result

    strcpy(cResult, cString1);
    strcat(cResult, cString2);

    std::cout << "Concatenation using C-style strings: " << cResult << std::endl;

    // Length of strings
    std::string cppString11 = "This is a C++ string";
    const char *cString = "This is a C-style string";

    std::cout << "Length of C++ string: " << cppString11.length() << std::endl;
    std::cout << "Length of C-style string: " << strlen(cString) << std::endl;

    // Comparison
    std::string str1 = "apple";
    std::string str2 = "banana";
    const char *cstr1 = "apple";
    const char *cstr2 = "banana";

    if (str1 == str2)
    {
        std::cout << "C++ strings are equal." << std::endl;
    }
    else
    {
        std::cout << "C++ strings are not equal." << std::endl;
    }

    if (strcmp(cstr1, cstr2) == 0)
    {
        std::cout << "C-style strings are equal." << std::endl;
    }
    else
    {
        std::cout << "C-style strings are not equal." << std::endl;
    }
}
#include <iostream>
#include <stack>

using namespace std;

int main() {
    stack<int> st;
    
    st.push(1);
    st.push(2);
    st.push(3);
    
    cout << "Top element of stack: " << st.top() << endl;
    
    cout << "Stack elements: ";
    while (!st.empty()) {
        cout << st.top() << " ";
        st.pop();
    }
    cout << endl;
    
    return 0;
}

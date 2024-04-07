#include<iostream>
using namespace std;

struct Node {
    int data;
    Node* left;
    Node* right;
};

class BinaryTree {
private:
    Node* root;

    Node* createNode(int value) {
        Node* newNode = new Node;
        newNode->data = value;
        newNode->left = nullptr;
        newNode->right = nullptr;
        return newNode;
    }

    Node* insertRecursive(Node* root, int value) {
        if (root == nullptr) {
            return createNode(value);
        }

        if (value < root->data) {
            root->left = insertRecursive(root->left, value);
        } else if (value > root->data) {
            root->right = insertRecursive(root->right, value);
        }

        return root;
    }

    void inorderTraversal(Node* root) {
        if (root != nullptr) {
            inorderTraversal(root->left);
            cout << root->data << " ";
            inorderTraversal(root->right);
        }
    }

public:
    BinaryTree() : root(nullptr) {}

    void insert(int value) {
        root = insertRecursive(root, value);
    }

    void displayInorder() {
        inorderTraversal(root);
        cout << endl;
    }
};

int main() {
    BinaryTree tree;
    tree.insert(60);
    tree.insert(50);
    tree.insert(30);
    tree.insert(60);
    tree.insert(40);
    tree.insert(30);
    tree.insert(20);

    cout << "Inorder traversal of the binary tree: ";
    tree.displayInorder();

    return 0;
}

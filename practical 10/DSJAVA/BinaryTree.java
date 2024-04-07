package DSJAVA;
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    private Node root;

    private Node createNode(int value) {
        return new Node(value);
    }

    private Node insertRecursive(Node root, int value) {
        if (root == null) {
            return createNode(value);
        }

        if (value < root.data) {
            root.left = insertRecursive(root.left, value);
        } else if (value > root.data) {
            root.right = insertRecursive(root.right, value);
        }

        return root;
    }

    private void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    public void displayInorder() {
        inorderTraversal(root);
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.print("Inorder traversal of the binary tree: ");
        tree.displayInorder();
    }
}

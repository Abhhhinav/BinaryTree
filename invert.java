package BinaryTree;

import BinaryTree.Levelorder.Node;

public class invert {

    public static Node Inv(Node root) {
        if (root == null) {
            return root;
        }

        Node leftside = Inv(root.left);
        Node rightside = Inv(root.right);

        root.right = leftside;
        root.left = rightside;

        return root;
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.println(root.data + "");
        Inorder(root.right);

    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.right = new Node(7);
        root.left = new Node(2);
        root.left.right = new Node(3);
        root.left.left = new Node(1);
        root.right.right = new Node(9);
        root.right.left = new Node(6);
        Inorder(root);
        System.out.println("*****************************");
        Node inverted = Inv(root);
        Inorder(inverted);
    }
}

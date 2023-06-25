package BinaryTree;

import BinaryTree.Levelorder.Node;

public class univalued {
    public static boolean isUnival(Node root) {
        if (root == null) {
            return true;
        }

        if (root.left != null && root.data != root.left.data) {
            return false;
        }

        if (root.right != null && root.data != root.right.data) {
            return false;
        }
        return isUnival(root.left) && isUnival(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        root.right = new Node(0);
        root.left = new Node(1);
        root.left.right = new Node(0);
        root.left.left = new Node(0);
        root.right.right = new Node(0);
        root.right.left = new Node(0);
        System.out.println(isUnival(root));

    }
}

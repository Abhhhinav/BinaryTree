package BinaryTree;
import BinaryTree.Levelorder.Node;

public class Kth_level {
    public static void k(Node root, int level, int K) {
        if (root == null) {
            return;
        }

        if (level == K) {
            System.out.print(root.data + " ");
            return;
        }

        k(root.left, level + 1, K);
        k(root.right, level + 1, K);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(3);
        root.left = new Node(2);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
        k(root, 1, 3);
    }
}

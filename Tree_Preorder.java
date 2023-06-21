package BinaryTree;

public class Tree_Preorder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        public Node Buildtree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = Buildtree(nodes);
            newNode.right = Buildtree(nodes);
            return newNode;
        }

        public static int  Preorder(Node root) {
            if (root == null) {
                return ;
            }
            System.out.println(root.data + "");
            Preorder(root.left);
            Preorder(root.right);

        }

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.Buildtree(nodes);
        tree.Preorder(root);
    }
}

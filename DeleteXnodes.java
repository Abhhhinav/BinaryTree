package BinaryTree;

import BinaryTree.Levelorder.Node;

public class DeleteXnodes {
    
    public static Node Del(Node root , int x){
        if(root == null){
            return root;
        }
        root.left = Del(root.left, x);
        root.right = Del(root.right, x);

        if(root.data==x && root.left == null && root.right == null){
            return null;
        }
        return root;
    }
    public static void Inorder(Node root) {
            if (root == null) {
                return;
            }
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);

        }
    
    public static void main(String[] args) {
        Node root = new Node(10); 
        root.right = new Node(10);
        root.left = new Node(3);
        root.left.right = new Node(1);
        root.left.left = new Node(3);
        root.right.right = new Node(3);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(3);
        Inorder(root);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        Node XXX = Del(root,3);
        Inorder(XXX);
    }
}

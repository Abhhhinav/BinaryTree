package BinaryTree;

import BinaryTree.Levelorder.Node;

public class SumTree {
    
    public static int Sum(Node root){
        if(root == null){
            return 0;
        }
       
        int leftChild= Sum(root.left);
        int rightChild = Sum(root.right);
       
        int data = root.data;
        int newLeft  = root.left==null?0:root.left.data;
        int newRight = root.right==null?0:root.right.data;
        root.data = newLeft + leftChild + newRight +rightChild;
        return data;
    }
     public static void Preorder(Node root) {
            if (root == null) {
                return ;
            }
            System.out.println(root.data + "");
            Preorder(root.left);
            Preorder(root.right);

        }
    public static void main(String[] args) {
         Node root = new Node(1); 
        root.right = new Node(3);
        root.left = new Node(2);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
        Sum(root);
        Preorder(root);
        
    }
}

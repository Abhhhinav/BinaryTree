package BinaryTree;

import BinaryTree.Levelorder.Node;

public class LowComAncestor {
    public static Node LCA(Node root , int N1 , int N2){
        if(root == null || root.data == N1 || root.data == N2){
            return root;
        }
        Node leftLCA = LCA(root.left,N1,N2);
        Node rightLCA = LCA(root.right,N1,N2);
 
        //LeftLCA = val  rightLCA = null
        if(rightLCA == null){
            return leftLCA;
        }
         if(leftLCA == null){
            return rightLCA;
        }
        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(3);
        root.left = new Node(2);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
        int n1=6; int n2= 7;
        System.out.println(LCA(root, n1, n2).data);
    }
}

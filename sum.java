package BinaryTree;
import BinaryTree.Levelorder.Node;
public class sum {
    public static int Sum(Node root){
         if(root == null){
            return 0;
         }
         int left = Sum(root.left);
         int right = Sum(root.right);
         return left + right + root.data;

    }
    public static void main(String[] args) {
        Node root = new Node(1); 
        root.right = new Node(3);
        root.left = new Node(2);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
        System.out.println(Sum(root));

    }
}

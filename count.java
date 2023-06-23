package BinaryTree;
import BinaryTree.Levelorder.Node;
public class count {
    public static int Count(Node root){
        if(root==null){
            return 0;
        }
        int left = Count(root.left);
        int right = Count(root.right);
        return left+ right +1;
    }
    public static void main(String[] args) {
                /*
                   1
                 /   \
               2      3
             / \     / \
           4    5   6   7

              */
        Node root = new Node(1); 
        root.right = new Node(3);
        root.left = new Node(2);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
        System.out.println(Count(root));

    }
}

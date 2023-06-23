package BinaryTree;
import BinaryTree.Levelorder.Node;
public class height {
   
    public static int Height(Node root){
        if(root == null){
            return 0;
        }
        int lh = Height(root.left);
        int rh = Height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static void main(String[] args) {
        /*
                    1
                 /   \
               2      3
             / \    /  \
           4    5  6    7

         */
        Node root = new Node(1); 
        root.right = new Node(3);
        root.left = new Node(2);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
        System.out.println(Height(root));

    }
}

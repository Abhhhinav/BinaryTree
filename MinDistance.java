package BinaryTree;
import BinaryTree.Levelorder.Node;
public class MinDistance {

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

    public static int LCAdist(Node root , int N){
        if(root==null){
            return -1;
        }
        if(root.data==N){
            return 0;
        }

        int leftdist = LCAdist(root.left, N);
        int rightdist = LCAdist(root.right, N);

        if(leftdist == -1 && rightdist == -1){
            return -1;
        }
        else if(leftdist == -1){
            return rightdist+1;
        }
        else{
            return leftdist+1;
        }
    }
    public static int minDist(Node root,int N1,int N2){
        Node lca = LCA(root, N1, N2);
        int dist1 = LCAdist(lca,N1);
        int dist2 = LCAdist(lca,N2);

        return dist1 + dist2;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(3);
        root.left = new Node(2);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
        System.out.println(minDist(root, 4, 6));
    }
}

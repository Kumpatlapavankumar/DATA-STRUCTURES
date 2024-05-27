mirror of the tree
import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int value){
        data=value;
        left=right=null;
    }
}
class Tree{
    Node root;
    Tree(){
        root=null;
    }
    void mirror(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        mirror(root.left);
        mirror(root.right);
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
}
public class praticefriday{
    public static void main(String[] args){
        Tree tree=new Tree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.left.left=new Node(3);
        tree.root.right=new Node(5);
       tree.mirror(tree.root);
    }
}

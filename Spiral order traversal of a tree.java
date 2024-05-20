//spiral of the tree
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
    boolean iterative=false;
    int height(Node root){
        if(root==null){
            return 0;
        }
        int heightleft=1+height(root.left);
        int heightright=1+height(root.right);
        if(heightleft>heightright){
            return heightleft;
        }else {
            return heightright;
        }
    }
    void slot(){
        int h=height(root);
        for (int i=1;i<=h;i++){
            printlevelatnodes(root,i,1,iterative);
            /*if(iterative==true) {
                iterative = false;
            }else{
                iterative=true;
            }*/
            iterative=!iterative;
        }
    }
    void printlevelatnodes(Node root,int level,int currentlevel,boolean iterative){
        if(root==null){
            return;
        }
        if(level==currentlevel){
            System.out.print(root.data+" ");
        }
        if(iterative==true){
            printlevelatnodes(root.left,level,currentlevel+1,iterative);
            printlevelatnodes(root.right,level,currentlevel+1,iterative);
        }else{
            printlevelatnodes(root.right,level,currentlevel+1,iterative);
            printlevelatnodes(root.left,level,currentlevel+1,iterative);
        }
    }
}
public class SpiralLevelOrderTraversal {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.right = new Node(6);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(8);
        tree.slot();
    }
}

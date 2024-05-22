import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int value){
        data=value;
        left=right=null;
    }
}
//edit this code
class Tree{
    Node root;
    Tree(){
        root=null;
    }
    int height(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=1+height(root.left);
        int rightheight=1+height(root.right);
        if(leftheight>rightheight){
            return leftheight;
        }else {
            return rightheight;
        }
    }
    void BFStree(){
        int h=height(root);
        for(int i=1;i<=h;i++){
            levelsisreturn(root,i,1);
        }
    }
    void levelsisreturn(Node root,int level,int currentlevel){
        if(root==null){
            return;
        }
        if(level==currentlevel){
            System.out.println(root.data+" ");
        }else{
            levelsisreturn(root.left,level,currentlevel+1);
            levelsisreturn(root.right,level,currentlevel+1);
        }
    }
}
public class BFSRecursive {
    public static void main(String[] args){
        Tree tree=new Tree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.left.left.right=new Node(6);
        tree.root.right.left=new Node(7);
        tree.root.right.right=new Node(8);
        tree.BFStree();
    }
}

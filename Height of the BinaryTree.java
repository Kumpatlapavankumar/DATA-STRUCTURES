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
    int height(Node root){
        if(root==null){
            return 0;
        }
        int heightleft=height(root.left);
        int heightright=height(root.right);
        if(heightleft>heightright){
            return heightleft+1;
        }else{
            return heightright+1;
        }
    }
    int heighttree(){
        return height(root);
    }
}
class Main{
    public static void main(String[] args){
        Tree tree=new Tree();
        tree.root=new Node(100);
        tree.root.left=new Node(70);
        tree.root.right=new Node(120);
        tree.root.left.left=new Node(67);
        tree.root.left.right=new Node(72);
        tree.root.right.left=new Node(110);
        tree.root.left.left.left=new Node(60);
        int treeheight=tree.heighttree();
        System.out.println(treeheight);

    }
}

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
    Void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    Node inserting(Node root,int key){
        if(root==null){
            Node root =new Node(key);
            return root;
        }
        if(root.data>key){
            return inserting(root.left,key);
        }
        if(root.data<key){
            return inserting(root.right,key);
        }
        return root;
    }
}
public class  insertingingofBST{
    public static void main(String[] args){
        Tree tree=new Tree();
        tree.root=new Node(100);
        tree.root.left=new Node(70);
        tree.root.right=new Node(120);
        tree.root.left.left=new Node(67);
        tree.root.left.right=new Node(72);
        tree.root.right.left=new Node(110);
        tree.root.left.left.left=new Node(60);
        System.out.println("Before inserting");
        tree.inorder(tree.root);
        System.out.print(tree.inorder(tree.root,12));
        System.out.println("After inserting");
        tree.inorder(tree.root);
    }
}

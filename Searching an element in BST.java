//BST
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
//searching key 
    boolean searching(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        else if(root.data>key){
            return searching(root.left,key);
        }else {
            return searching(root.right,key);
        }
    }
}
public class  searchingofBST{
    public static void main(String[] args){
        Tree tree=new Tree();
        tree.root=new Node(100);
        tree.root.left=new Node(70);
        tree.root.right=new Node(120);
        tree.root.left.left=new Node(67);
        tree.root.left.right=new Node(72);
        tree.root.right.left=new Node(110);
        tree.root.left.left.left=new Node(60);
        System.out.print(tree.searching(tree.root,600));
    }
}


/*class Tree{
    Node root;
    Tree(){
        root=null;
    }
    void Bfstree(){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.peek();
            q.remove();
            System.out.println(temp.data);
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }
}
public class BFSIterative {
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
        tree.Bfstree();
    }
}*/
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
    void bfstree(){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node temp=q.peek();
            q.remove();
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
        }
    }
}
public class BFSIterative {
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
        tree.bfstree();
    }
}

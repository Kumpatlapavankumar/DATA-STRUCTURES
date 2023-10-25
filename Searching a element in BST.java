
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
    public boolean searching(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return searching(root.left,key);
        }
        else if(root.data<key){
            return searching(root.right,key);
        }
        return false;
    }
}
public class Main
{
	public static void main(String[] args) {
		Tree tree=new Tree();
		tree.root=new Node(60);
		tree.root.left=new Node(57);
		tree.root.right=new Node(70);
		tree.root.left.left=new Node(50);
		tree.root.left.right=new Node(62);
		tree.root.right.left=new Node(66);
		tree.root.right.right=new Node(78);
		System.out.println(tree.searching(tree.root,74));
	}
}

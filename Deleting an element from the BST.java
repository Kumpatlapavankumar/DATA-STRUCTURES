//deleting a node
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
    Node deleting(Node root,int key){
        if(root==null){
            return root;
        }else if(root.data>key){
            root.left=deleting(root.left, key);
        }
        else if(root.data<key){
            root.right=deleting(root.right, key);
        }else{
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                root.data=minvalue(root.left);
                root.left=deleting(root.left,root.data);
            }
        }
    }
    int minvalue(Node root){
        if(root==null){
            return 0;
        }else{
            int temp=root.data;
            while(root.left!=null){
                temp=root.left.data;
                root=root.left;
            }
            return temp;
        }
    }
}
public class  deletingofBST{
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
        tree.deleting(tree.root,67);
        System.out.println("After inserting");
        tree.inorder(tree.root);
    }
}

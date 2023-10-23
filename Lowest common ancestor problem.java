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
   /* void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    int minvalue(Node root){
        int temp=root.data;
        while(root.left!=null){
            temp=root.left.data;
            root=root.left;
        }
        return temp;
    }
    Node deletinganode(Node root,int key){
        if(root==null){
            return root;
        }else if(root.data>key){
            root.left= deletinganode(root.left,key);
        }else if(root.data<key){
            root.right=deletinganode(root.right,key);
        }else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }else{
                int min=minvalue(root.right);
                root.data=min;
                root.right=deletinganode(root.right,min);
            }
        }
        return root;
    }*/
    int lowestansseter(Node root,int n1,int n2){
        if(root==null){
            return 0;
        }else if(n1<root.data && n2<root.data){
            return lowestansseter(root.left,n1,n2);
        }else if(n1>root.data && n2>root.data){
            return lowestansseter(root.right,n1,n2);
        }
        return root.data;
    }
}
public class deletingnode {
    public static void main(String[] args) {
        Tree tree = new Tree();
        // Insert nodes into the tree
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        //System.out.println("In-order traversal before deletion:");
        //tree.inorder(tree.root);

        //tree.root = tree.deletinganode(tree.root, 80);

        //System.out.println("\nIn-order traversal after deleting:");
        //tree.inorder(tree.root);
        System.out.println(tree.lowestansseter(tree.root, 60, 80));
    }
}

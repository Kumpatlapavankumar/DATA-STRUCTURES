class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class implementinlinkedlist {
    Node top=null;
    boolean isEmpty(){
        return top==null;
    }
    void push(int data){
        Node newNode=new Node(data);
        newNode.next=top;
        top=newNode;
    }
    void pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        top=top.next;
    }
    Integer peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
        }
        return top.data;
    }
    public static void main(String[] args){
        implementinlinkedlist list=new implementinlinkedlist();
        list.push(1);
        list.push(2);
        list.push(3);
        System.out.println(list.peek());
        list.pop();
        System.out.println(list.peek());
        list.pop();
        System.out.println(list.peek());
    }
}

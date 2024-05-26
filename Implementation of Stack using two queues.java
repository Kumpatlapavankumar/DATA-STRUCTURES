//queues
import java.util.Queue;
import java.util.LinkedList;
public class stackimpusingqueue{
	Queue<Integer> q1=new LinkedList<Integer>();
	Queue<Integer> q2=new LinkedList<Integer>();
	static int size;
	static int size2;
	void push(int x){
		q2.add(x);
		while(!q1.isEmpty()){
			q2.add(q1.peek());
			q1.remove();
		} 
		Queue<Integer> q=q1;
		q1=q2;
		q2=q;
	}
	void pop(){
		if(q1.isEmpty())
			return;
		q1.remove();
	}
	int peek(){
		if(q1.isEmpty()){
			return -1;
		}
		return q1.peek();
	}
	int size(){
		return q1.size();
	}
	int size2(){
		return q2.size();
	}
	public static void main(String[] args){
		stackimpusingqueue stack=new stackimpusingqueue();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("Current size:"+stack.size());
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		System.out.println("Eppudu size:"+stack.size2);
	}
}

import java.util.Queue;
import java.util.LinkedList;
public class stackimpusing1que{
	Queue<Integer> q1=new LinkedList<>();
	void push(int x){
		int size=q1.size();
		q1.add(x);
		for(int i=0;i<size;i++){
			int k=q1.remove();
			q1.add(k);
		}
	}	
	int pop(){
		if(q1.isEmpty()){
			return -1;
		}
		return q1.remove();
	}
	int peek(){
		if(q1.isEmpty()){
			return -1;
		}
		return q1.peek();
	}	
	public static void main(String[] args){
		stackimpusing1que s1=new stackimpusing1que();
		s1.push(1);
		s1.push(2);
		s1.push(3);
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1.peek());
		s1.pop();
		System.out.println(s1.peek());
	}
}

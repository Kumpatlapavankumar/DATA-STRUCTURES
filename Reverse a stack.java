reverse stack
import java.util.Stack;
public class revstack{
    public static void reverse(Stack<Integer> st){
    Stack<Integer> auxstack=new Stack<>();
    while(!st.isEmpty()){
        int item=st.pop();
        auxstack.push(item);
    }
    while(!auxstack.isEmpty()){
        int item=auxstack.pop();
        st.push(item);
    }
    }
    public static void main(String[] args){
        Stack <Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}

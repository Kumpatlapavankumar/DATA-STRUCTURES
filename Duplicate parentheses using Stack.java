import java.util.Stack;
public class Main{
    public static boolean Duplicatechecker(String name){
        Stack<Character> s=new Stack<>();
        for (char c:name.toCharArray()){
            if(c==')'){
                char val=s.pop();
                int count=0;
                while(val!='('){
                    count++;
                    val=s.pop();
                }
                if(count==0){
                    return false;
                }
            }else{
                s.push(c);
            }
        }
        return true;
    }
    public static void main(String[] arhs){
        String name="(a+b)+c";
        if(Duplicatechecker(name)){
            System.out.println("No Duplicate parenthesis");
        }else{
            System.out.println("Duplicate parenthesis");
        }
    }
}

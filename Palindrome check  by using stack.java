//palindrome checker using stack
import java.util.*;
public class pailndrome{
    public static void main(String[] args){
        String name="madkam";
        pailndromematching(name);
    }
    public static void pailndromematching(String name){
        Queue<Character> queue=new LinkedList<>();
        for(int i=name.length()-1;i>=0;i--){
            queue.add(name.charAt(i));
        }
        String reverse="";
        while(!queue.isEmpty()){
            reverse=reverse+queue.remove();
        }
        if(name.equals(reverse)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}

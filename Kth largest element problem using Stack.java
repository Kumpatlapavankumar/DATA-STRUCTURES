import java.util.*;

public class Source {
  // This function returns the sorted stack
   public static Stack < Integer > sortStack(Stack < Integer > input) {
       Stack <Integer> temp = new Stack <>();

       while (!input.isEmpty()) {
           // pop out the top element in stack
           int value = input.pop();

          
           while (!temp.isEmpty() && value < temp.peek()) {
               // pop the last element from temporary stack and push it to the input stack
               input.push(temp.pop());
           }

           // push value in the temp stack
           temp.push(value);
       }
       return temp;
   }

   public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {
       int j = 1;
       while (j < k) {
           sortedStack.pop();
           j++;
       }
       System.out.println(sortedStack.peek());
   }


  public static void main(String args[]) {
      Stack < Integer > inputStack = new Stack < Integer > ();
      Scanner in = new Scanner(System.in);
      int n = in .nextInt();
      for (int i = 0; i < n; i++) {
          inputStack.add( in .nextInt());
      }

      if (inputStack.isEmpty()) {
          System.out.println("stack is empty");
          System.exit(0);
      }

      int k = in .nextInt();
      if (k > inputStack.size()) {
          System.out.println("invalid input");
          System.exit(0);
      }

      // This is the temporary stack

      Stack < Integer > temp = sortStack(inputStack);
               findKthLargestNum(temp, k);

  }
}

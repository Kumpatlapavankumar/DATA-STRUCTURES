import java.util.Stack;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return; // Nothing to reverse if the stack is empty
        }

        Stack<Integer> auxStack = new Stack<>();

        // Pop elements from the original stack and push them onto the auxiliary stack
        while (!stack.isEmpty()) {
            int item = stack.pop();
            auxStack.push(item);
        }

        // Now, the auxiliary stack contains the elements in reverse order

        // Pop elements from the auxiliary stack and push them back into the original stack
        while (!auxStack.isEmpty()) {
            int item = auxStack.pop();
            stack.push(item);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed stack: " + stack);
    }
}

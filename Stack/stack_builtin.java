import java.util.*;
public class stack_builtin {
    public static void main(String[] args) {

    /////using  Stack()
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Poped element : "+stack.pop());
        System.out.println("top element : "+stack.peek());
        System.out.println(stack.isEmpty());

    /////using ArrayDeque
        Deque<Integer> stack1 = new ArrayDeque<>();

        stack1.push(11);
        stack1.push(12);
        stack1.push(13);

        stack1.pop();
        System.out.println("Top element in stack : "+stack1.peek());
    }
}

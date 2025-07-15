import java.util.*;
class MyStack{
    Queue<Integer> queue = new LinkedList<>();

    public void push(int x){
        queue.add(x);
        int size = queue.size();

        for(int i = 0;i<size-1;i++){
            queue.add(queue.remove());
        }
    }

    public int pop(){
        if(queue.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return queue.remove();
    }

    public int top(){
        if(queue.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue.peek();
    }
}
public class stackUsingQueue {
    public static void main(String[] args) {
        MyStack st= new MyStack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println("Top element : "+st.top());
        System.out.println("poped element : "+st.pop());
        System.out.println("top after pop element : "+st.top());
    }
}

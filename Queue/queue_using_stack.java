import java.util.*;
public class queue_using_stack {
    static class MyQueue{
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void enqueue(int x){
            s1.push(x);
        }

        int dequeue(){
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            if(s2.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }else{
                return s2.pop();
            }
        }

        int peek(){
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            if(s2.isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }else{
                return s2.peek();
            }
            
        }

        void Display(){
            List<Integer> result = new ArrayList<>();

            for(int i = s2.size()-1; i>=0;i--){
                result.add(s2.get(i));
            }

            for(int i = 0;i<s1.size();i++){
                result.add(s1.get(i));
            }

            System.out.println("Queue : "+result);
        }
    }
    public static void main(String[] args){
        MyQueue q = new MyQueue();
        q.enqueue(10);
        q.enqueue(105);
        q.enqueue(101);
        q.enqueue(100);
        q.Display();
        System.out.println("Front element : "+q.peek());
        q.dequeue();
        System.out.println("Front element after dequeue : "+q.peek());
        q.Display();

    }
}

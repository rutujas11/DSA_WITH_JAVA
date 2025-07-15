public class stackArray {
    int top = -1;
    int capacity;
    int[] stack;

    stackArray(int size){
        capacity = size;
        top = -1 ;
        stack = new int[capacity];
    }

    void push(int data){
        if(top == capacity-1){
            System.out.println("Stack is full, can't add!");
            return;
        }
        stack[++top] = data;
    }

    int pop(){
        if(isempty()){
            System.out.println("Stack is empty, can't delete!");
            return -1;
        }
        return stack[top--];
    }

    int peek(){
        if(isempty()){
            return -1;
        }
        return stack[top];
    }
    boolean isempty(){
        return top==-1;
    }

    void printstack(){
        if(isempty()){
            System.out.println("stack is empty");
            return;
        }

        System.out.println("stack from top to bottom");
        for(int i = top;i>=0;i--){
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
    stackArray stack = new stackArray(3);
    stack.push(1);
    stack.push(2);
    stack.push(3);

    System.out.println("Top element : "+stack.peek());
    System.out.println("poped element : "+stack.pop());
    System.out.println("is empty : "+stack.isempty());
    stack.printstack();
}
}



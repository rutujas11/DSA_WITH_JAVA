class stackLinkedList {
    static class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }
    }

    Node top = null;
    void push(int data){
        Node newnode = new Node(data);
        newnode.next = top;
        top = newnode;
    }

    int pop(){
        if(top == null){
            System.out.println("stack is empty");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    int peek(){
        if(top==null){
            System.out.println("stack is empty");
            return -1;
        }
        return top.data;
    }

    void printstack(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;
        System.out.print("Stack using LinkedList : ");
        while(temp != null){
            System.out.print(temp.data+ " ---> ");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public static void main(String[] args){
        stackLinkedList stackobj = new stackLinkedList();

        stackobj.push(1);
        stackobj.push(2);
        stackobj.push(3);
        stackobj.push(4);

        System.out.println("top element : "+stackobj.peek()); 
        System.out.println("poped element : "+stackobj.pop());
        System.out.println("top element : "+stackobj.peek()); 

        stackobj.printstack();
    }


}

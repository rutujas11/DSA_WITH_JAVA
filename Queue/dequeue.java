
//-----> Using LinkedList
class Node{
    int data;
    Node prev, next;

    Node(int data){
        this.data = data;
    }
}
class Mydeque{
    private Node front, rear;

    public void insertfront(int data){
        Node newnode = new Node(data);
        if(front == null){
            front = rear = newnode;
        }else{
            newnode.next = front;
            front.prev = newnode;
            front = newnode;
        }
    }

    public void insertrear(int data){
        Node newnode = new Node(data);
        if(rear == null){
            front = rear = newnode;
        }else{
            rear.next = newnode;
            newnode.prev = rear;
            rear = newnode;
        }
    }
    
    public int removefront(){
        if(rear == null) return -1;
        if(front == rear){
            int temp = front.data;
            front = rear = null;
            return temp;
        }
        else{
            int temp = front.data;
            front = front.next;
            front.prev = null;
            return temp;
        }
    }
    
    public int removerear(){
        if(rear == null) return -1;
        if(front == rear){
            int temp = front.data;
            front = rear = null;
            return temp;
        }else{
            int temp = rear.data;
            rear = rear.prev;
            rear.next = null;
            return temp;
        }
    }

    public void display(){
        Node temp = front;
        System.out.print("Dequeue : ");
        while(temp!=null){
            System.out.print(temp.data+" ---> ");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }
}

public class dequeue {
    public static void main(String[] args) {
        Mydeque dq = new Mydeque();

        dq.insertfront(20);
        dq.insertfront(10);
        dq.insertrear(30);
        dq.insertrear(40);

        dq.display();

        System.out.println("Deleted front element : "+dq.removefront());
        dq.display();
        System.out.println("Deleted rear element : "+dq.removerear());
        dq.display();




    }
}

//----->Using ArrayDeque (inbuilt Deque)
    // public static void main(String[] args){
    //     Deque<Integer> deque = new ArrayDeque<>();

    //     deque.addLast(10);
    //     deque.addLast(20);

    //     deque.addFirst(5);
    //     deque.addFirst(100);

    //     System.out.println("Deque : "+deque);

    //     System.out.println("removed from front : "+deque.removeFirst());
    //     System.out.println("Removed from rear : "+deque.removeLast());

    //     System.out.println("Deque : "+deque);

    //     System.out.println("Front element : "+deque.peekFirst());
    //     System.out.println("Rear element : "+deque.peekLast());
    // }
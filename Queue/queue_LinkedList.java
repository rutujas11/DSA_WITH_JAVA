public class queue_LinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class MyQueue{
        private Node front, rear;

        public MyQueue(){
            this.front = this.rear = null;
        }

        public void enqueue(int data){
            Node newnode = new Node(data);
            if(rear == null){
                front = newnode;
                rear = newnode;
                return;
            }
            rear.next = newnode;
            rear = newnode;
        }

        public int dequeue(){
            if(front == null) return -1;
            int res = front.data;
            front = front.next;
            return res;
        }

        public void display(){
            if(front == null){
                System.out.println("Queue is empty");
            }else{
                Node temp = front;
                while(temp != null){
                    System.out.print(temp.data+" --> ");
                    temp = temp.next;
                }
                System.out.print("Null");
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
        int removed = q.dequeue();
        if (removed == -1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("deleted element from queue : "+removed);
        }
        q.display();
        
    }
}

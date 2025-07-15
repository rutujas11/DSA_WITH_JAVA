public class queue_array {
    static class MyQueue{
        int[] arr;
        int front, rear, capacity;

        MyQueue(int size){
            arr = new int[size];
            front = rear = 0;
            capacity = size;
        }

        void enqueue(int x){
            if(rear == capacity){
                System.out.println("Queue is full");
                return;
            }
            arr[rear++] = x;
        }
        void dequeue(){
            if(rear == front){
                System.out.println("Queue is empty");
                return;
            }
            for(int i = front;i<rear-1;i++){
                arr[i] = arr[i+1];
            }
            rear--;
        }

        void display(){
            if(rear == front){
                System.out.println("Queue is empty");
                return;
            }

            for(int i = front; i<rear;i++){
                System.out.print(arr[i]+" ---> ");
            }
            System.out.println();
        }

        
    }
    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(40);
        q.enqueue(30);
        q.enqueue(50);
        q.enqueue(100);
        q.display();
    }
}

public class CircularDeque {
    int[] arr;
    int front, rear, size, capacity;
    
    public CircularDeque(int k){
        capacity = k;
        arr = new int[capacity];
        front = -1;
        rear = 0;
        size = 0;
    }  

    public boolean isFull(){
        return size == capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insertFront(int value){
        if(isFull()) return false;
        if(isEmpty()) {
            rear = front= 0;
        }else{
            front = (front-1+capacity) % capacity;
        }
        arr[front] = value;
        size++;
        return true;
    }

    public boolean insertRear(int value){
        if(isFull()) return false;
        if(isEmpty()){
            front = rear = 0;
        }else{
            rear = (rear + 1)%capacity;
        }
        arr[rear] = value;
        size++;
        return true;
    }

    public int deletefront(){
        if(isEmpty()) return -1;

        int temp = arr[front];
        if(front == rear){
            front = rear = -1;
        }else{
            front = (front+1)%capacity;
        }
        size--;
        return temp;
    }

    public int deleterear(){
        if(isEmpty()) return -1;
        int temp = arr[rear];
        if(front == rear){
            front = rear = -1;
        }else{
            rear = (rear-1+capacity)%capacity;
        }
        size--;
        return temp;
    }

    public int getfront(){
        if(isEmpty()) return -1;
        return arr[front];
    }

    public int getrear(){
        if(isEmpty()) return -1;
        return arr[rear];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue elements : ");
        int i = front;
        while (true) { 
            System.out.print(arr[i]+"  ");
            if(i == rear) break;
            i = (i+1)%capacity;
        }
        System.out.println();
    }


    public static void main(String[] args){
        CircularDeque cdq = new CircularDeque(5);

        cdq.insertFront(20);
        cdq.insertFront(10);
        cdq.insertRear(30);
        cdq.insertRear(40);
        cdq.display();
        System.out.println("Front element : "+cdq.getfront());
        System.out.println("Rear element : "+cdq.getrear());


        System.out.println("Deleted from front : "+cdq.deletefront());
        System.out.println("Deleted from rear : "+cdq.deleterear());
        cdq.display();
        System.out.println("Front element : "+cdq.getfront());
        System.out.println("Rear element : "+cdq.getrear());

        
    } 
}

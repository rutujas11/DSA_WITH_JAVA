class Linkedlist{
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void addfirst(int data){
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }
    
    public void addlast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void insert_at_index(int data, int idx){
        Node newnode = new Node(data);

        if(idx == 0){
            addfirst(data);
        }

        Node temp = head;
        int i = 0;
        while(i<idx-1 && temp.next != null){
            temp = temp.next;
            i++;
        }

        if(temp.next == null){
            System.out.println("Index out of range");
            return;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void add_before_index(int data, int idx){
        insert_at_index(data, idx-1);
    }

    public void add_after_index(int data, int idx){
        insert_at_index(data, idx+1);
    }

    public void removefirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    public void removelast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node secondlast = head;
        Node last = head.next;

        while(last.next != null){
            secondlast = secondlast.next;
            last = last.next;
        }
        secondlast.next = null;
    }

    public void deletebyidx(int idx){
        if(idx == 0){
            removefirst();
        }

        Node temp = head;
        int i = 0;
        while(i<idx-1 && temp.next != null){
            temp = temp.next;
            i++;
        }
        if(temp.next == null){
            System.out.println("Index not found");
            return;
        }

        temp.next = temp.next.next;
    }

    public void printlist(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"--->");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public void deletebyvalue(int data){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(data == head.data){
            head = head.next;
            return;
        }

        Node temp = head;
        while(temp.next.data != data && temp.next != null){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Value not found for deletion");
            return;
        }
        temp.next = temp.next.next;
    }

    public static void main(String args[]){
        Linkedlist llist = new Linkedlist();

        llist.addfirst(4);
        llist.addfirst(3);
        llist.addfirst(2);
        llist.addfirst(1);
        llist.addlast(5);
        llist.addlast(6);
        llist.addlast(7);
        llist.addlast(8);
        llist.addlast(9);

        System.out.print("LinkedList created : ");
        llist.printlist();
        System.out.println();

        System.out.print("LinkedList after deleting first number : ");
        llist.removefirst();
        llist.printlist();
        System.out.println();

        System.out.print("LinkedList after deleting last number : ");
        llist.removelast();
        llist.printlist();
        System.out.println();

        System.out.print("LinkedList after inserting new number at index 2: ");
        llist.insert_at_index(33, 2);
        llist.printlist();
        System.out.println();

        System.out.print("LinkedList after deleting(by index) number at index 3 : ");
        llist.deletebyidx(3);
        llist.printlist();
        System.out.println();

        System.out.print("LinkedList after deleting(by value) number 8 : ");
        llist.deletebyvalue(8);
        llist.printlist();
        System.out.println();
    }
}
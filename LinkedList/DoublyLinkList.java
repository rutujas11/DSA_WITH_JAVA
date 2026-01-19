class DoublyLinkList {
    class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head = null;
    

    public void addfirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void addlast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newnode;
        newnode.prev = temp;
        // temp = newnode;
    }

    public void insertAt(int data, int idx){
        Node newnode = new Node(data);
        Node temp = head;
        int i = 0;
        while(temp != null && i<idx-1){
            temp = temp.next;
            i++;
        }
        if(temp == null){
            System.out.println("Invalid Index(Index out of bound)");
            return;
        }
        newnode.next = temp.next;
        newnode.prev = temp;
        temp.next.prev = newnode;
        temp.next = newnode;
    }

    public void delete_at_idx(int idx){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(idx == 0){
            head = head.next;
            head.prev = null;
            return;
        }
        Node temp = head;
        int i = 0;

        while(temp != null && i<idx){
            temp = temp.next;
            i++;
        }
        if(temp == null){
            System.out.println("Invalid Index(Index out of bound)");
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        // Alternate method
        // change in while condition ==> while(temp != null && i<idx-1)
         // temp.next = temp.next.next;
         // temp.next.prev = temp;
        
    }

    public void delete_by_value(int data){
        Node temp  = head;
        while(temp != null && temp.data != data){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Not found");
            return;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

    }
    public void length(){
        int len = 0;
        if(head == null){
            System.out.println("List is empty (length = 0)");
            return;
        }
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        System.out.println("length of linked list is : "+len);
    }

    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" <--> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]){
        DoublyLinkList dll = new DoublyLinkList();

        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        dll.addlast(4);
        dll.addlast(5);
        dll.insertAt(10, 1);
        dll.printlist();
        System.out.println("After deletion of number at idx 1");
        dll.delete_at_idx(3);
        dll.printlist();
        System.out.println("After deletion of value 4");
        dll.delete_by_value(4);
        dll.printlist();
        dll.length();
    }

}

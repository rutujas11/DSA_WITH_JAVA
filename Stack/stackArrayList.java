import java.util.ArrayList;
public class stackArrayList {
    ArrayList<Integer> list = new ArrayList<>();

    void push(int data){
        list.add(data);
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return list.remove(list.size()-1);
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return list.get(list.size()-1);
    }
    boolean isEmpty(){
        return list.isEmpty();
    }

    void printstack(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack from top to bottom : ");
        for(int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        stackArrayList listobj = new stackArrayList();

        listobj.push(1);
        listobj.push(2);
        listobj.push(3);
        listobj.push(4);

        System.out.println("poped element : "+listobj.pop());
        System.out.println("top element : "+listobj.peek());
        listobj.printstack();
        

    }
}

import java.util.ArrayList;
import java.util.Arrays;
public class Arraylist {
    public static void main(String[] args) {
    //Creation
        ArrayList<Integer> list = new ArrayList<>();

    //Insertion   
        list.add(10);
        list.add(23);
        list.add(34);
        System.out.println("List Created : "+list);

    //Deletion
        list.remove(0);   //remove(int index)
        System.out.println("deleted element at index 0 : "+list);
        //remove woth condition
        list.removeIf(n -> (n%2 == 0));
        System.out.println("Remove if element is even and return list : "+list);

    //for deleting all elements at once -----> list.clear();

    //adding element using index
        //using add()
        list.add(0, 5);  
        System.out.println("Adding element at specified index : "+list);
        //using set()
        list.set(1,100);
        System.out.println("Setting element using set method : "+list);

    //get element using index
        int ele = list.get(1);
        System.out.println("Get element using get() : "+ele);


    //check occurence of specified element
        System.out.println("does 100 present in array : "+list.contains(100));
 
    //apply any operation on all elements of array at once
        System.out.print("Printing squares of elements with one line only : ");
        list.forEach(num -> System.out.print(num*num+", "));
        System.out.println();
    
    //Find Index of element
        System.out.println("Index of 100 is : "+list.indexOf(100));
        // for finding last index (occurrence) of any number ----> arr.lastIndexOf(element)

    

    //Length of array
        int listlen = list.size();
        System.out.println("Length of array : "+listlen);

    //convert to array
        Object[] newarr = list.toArray();
        System.out.println("arraylist to array : " + Arrays.toString(newarr));
        System.out.println("Arraylist as array : "+newarr[0]);

    
    }
}

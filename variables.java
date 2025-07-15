import java.util.*;
public class variables {
    public static void main(String args[]){
        // println and \n does same work to add new line next to current statement
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int num = sc.nextInt();
        Float doc = sc.nextFloat();
        System.out.print("my name is "+name+"\nmy age is "+num+"\nmy weight is "+doc);
    }
}

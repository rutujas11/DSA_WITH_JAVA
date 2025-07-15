import java.util.Scanner;
public class arrays {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        // int[] marks = new int[5];
        // marks[0] = 89;
        // marks[1] = 96;
        // marks[2] = 92;
        // marks[3] = 84;
        // marks[4] = 99;
        // for (int i=0;i<5;i++){
        //     System.out.println(marks[i]);
        // }
        
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];                        //by default it stores o for int in each index of array
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Enter key to search");
        int key = sc.nextInt();
        for (int i=0;i<numbers.length; i++){
            if(numbers[i] == key){
                System.out.println("Key found at index "+i);
            }
        }   
    }
    
}

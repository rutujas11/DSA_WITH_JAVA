import java.util.Scanner;
public class conditionals {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        // IF-Else 
        if(age>18){
            System.out.println("Adult");
        }else {
            System.out.println("Not Adult");
        }

        //switch conditionals
        System.out.println("Enter your choice for button: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1 : System.out.println("hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid choice");
        }
    }

}

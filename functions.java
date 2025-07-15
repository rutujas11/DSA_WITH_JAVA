import java.util.Scanner;
public class functions {


    // public static void printMyName(String name){
    //     System.out.println("My name is "+name);
    // }


    // public static int calculateProduct(int a, int b){
    //     int product = a*b;
    //     return product;
    // }

    public static void printFactorial(int n){
        if (n<0){
            System.out.println("Invalid number");
            return;
        }
        int fact = 1;
        for(int i = n;i>=1;i--){
            fact *= i;
        }
        System.out.println("Factorial is : "+fact);
    }


    @SuppressWarnings("resource")
    public static void main(String args[]){
        // System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // printMyName(name);


        // System.out.println("Enter a and b: ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("product of 2 numbers is : "+calculateProduct(a,b));

        System.out.println("Enter n: ");
        int n = sc.nextInt();
        printFactorial(n);
    }
}

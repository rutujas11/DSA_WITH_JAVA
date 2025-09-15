
public class recursion1 {

//-----> print numbers 1 to 10  
    public static void printnum(int n){
        if(n == 11){
            return;
        }
        System.out.print(n+" ");
        printnum(n+1);
    }

//-----> Print sum of n natural numbers
    public static void naturalsum(int i,int n,int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        naturalsum(i+1, n, sum);
    }

//-----> Print factorial of x
    public static void fact(int x, int product) {
        if(x == 0 || x == 1){
            System.out.println(product);
            return;
        }
        product *= x;
        fact(x-1, product);
    }

//----->Fibonacci sequence
    public static void fibonacci(int a, int b, int y){
        if(y == 0 ){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibonacci(b, c, y-1);
    }

    
//-----> f^p using stack height p
    public static int fraisedto(int f, int p){
        if(p == 0){
            return 1;
        }
        if(f == 0){
            return 0;
        }
        int fpowpm1 = fraisedto(f, p-1);  ///f power p-1   
        int fpowp = f * fpowpm1;    // f power p
        return fpowp;
    }
    public static void main(String args[]){
        int n = 1;
        System.out.print("print numbers from 1 to 10 using recursion : ");
        printnum(n);

        //-------------------------------------------------------------------------------------------------------
        int r = 5;
        System.out.print("\nSum of first "+r+" natural numbers :");
        naturalsum(1, r, 0);

        ///-------------------------------------------------------------------------------------------------------
        int x  = 5;
        System.out.print("Print factorial of "+x+" : ");
        fact(x, 1);

        //--------------------------------------------------------------------------------------------------------
        int a = 0, b = 1;
        int y = 7;
        System.out.print("Fibonacci series for "+y+ ": ");
        System.out.println("\n"+a);
        System.out.println(b);
        fibonacci(a, b, y-2);

        //--------------------------------------------------------------------------------------------------------
        int f = 2; 
        int p = 3;
        int ans = fraisedto(f, p);
        System.out.println(f+" raised to "+p+" : "+ans);
    
    }
}

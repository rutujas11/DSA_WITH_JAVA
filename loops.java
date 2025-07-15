
public class loops {
    public static void main(String args[]){
        // FOR loop
        System.out.println("FOR loop");
        for(int i = 0; i<5; i++){
            
            System.out.println(i);
        }

        //while loop
        System.out.println("While loop");
        int i = 0;
        while(i<5){
            System.out.println(i);
            i++;
        }

        //do while loop
        System.out.println("Do While loop");
        i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i<5);
        

        //mini project --> 1)print sum of n natural numbers
        int n = 10;
        int sum = 0;
        for(int j = 1;j<=n;j++){
            sum += j;
        }
        System.out.println("Sum of first "+n+" natural numbers is :"+sum);


        //mini project --> 2)print table of 2
        for(int k=1; k<=10;k++){
            int pro = 2*k;
            System.out.println("2 x "+k+" = "+pro);
        }

    }
}
